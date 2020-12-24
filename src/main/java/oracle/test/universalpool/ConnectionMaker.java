package oracle.test.universalpool;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resources;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import oracle.test.universalpool.mybatis.samples.model.TransferInfo;
import oracle.ucp.*;
import oracle.ucp.admin.UniversalConnectionPoolManager;
import oracle.ucp.admin.UniversalConnectionPoolManagerImpl;
import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

@RestController
public class ConnectionMaker {
	static final String XML_CONFIG_BATIS = "oracle/test/universalpool/mybatis-config2.xml";
	static final String SELECT_ALL_FROM_TRANSFER = "findAllByCateg";

	UniversalConnectionPoolManager mgr = null;

	public Object loadClassFromJar(String pathname) throws NoSuchMethodException, SecurityException, Exception {
		File file = new File(pathname);
		URL url = file.toURI().toURL();

		URLClassLoader classLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
		Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
		method.setAccessible(true);
		method.invoke(classLoader, url);

//				classLoader.
		return method;
	}

	@GetMapping(value = "/xx")
	public void print() {
		System.out.println("chekc if it's work");
		InputStream inputStream;
		try {
			Object obj = new Object();
			inputStream = org.apache.ibatis.io.Resources.getResourceAsStream(XML_CONFIG_BATIS);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory sqlSessionFactory = builder.build(inputStream, "development_oracle");
//			SelectStatementProvider selectStatement = sel;
//			sqlSessionFactory.openSession().select(statement, handler);
//			sqlSessionFactory.openSession().insert(statement);
//			sqlSessionFactory.openSession().update(statement);

//			List<TransferInfo> lstTransferInfo = sqlSessionFactory.openSession().selectList("findAllByCateg");
			List<TransferInfo> lstTransferInfo = sqlSessionFactory.openSession()
					.selectList(SELECT_ALL_FROM_TRANSFER, null, (new RowBounds(0,100)));

			for (TransferInfo transferInfo_ : lstTransferInfo) {
				System.out.println(transferInfo_.getTransferId()+"  ***  "+transferInfo_.getDescription());
			}
			/*
			 * sqlSessionFactory.openSession().select(SELECT_ALL_FROM_TRANSFER, new
			 * ResultHandler<TransferInfo>() {
			 * 
			 * @Override public void handleResult(ResultContext<? extends TransferInfo>
			 * resultContext) {
			 * 
			 * String id = resultContext.getResultObject().getTransferId();
			 * 
			 * System.out.println(id); } });
			 */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@GetMapping("/yy")
	public @ResponseBody void getConnection() throws SQLException, UniversalConnectionPoolException {
		mgr = UniversalConnectionPoolManagerImpl.getUniversalConnectionPoolManager();
		String dbUrl = "x";
		String userName = "ES_RIM";
		String password = "esdmsearim";
		String poolName = "poolName";
		// Authentication using Kerberos ???
		// Authentication through SSL certificates ??
		// Authentication using Lightweight Directory Access Protocol (LDAP) ??
//		pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
		PoolDataSource pds = null;
		Connection connection = null;
		String Url = "jdbc:oracle:thin:ES_RIM/esdmsearim@rmodavm.itamana.net:1521:stage";
		String Url2 = "jdbc:oracle:thin:@//rmodavm.itamana.net:1545/stage";
		try {
//			OracleDataSource ods = new OracleDataSource();
//			//
////			Method method = new Method(new Class<oracle.jdbc.pool.OracleDataSource>) ;
//			Class concreteClass = OracleDataSource.class;
//			
//			try {
//				// below method is used most of the times in frameworks like JUnit
//				//Spring dependency injection, Tomcat web container
//				//Eclipse auto completion of method names, hibernate, Struts2 etc.
//				//because ConcreteClass is not available at compile time
//				concreteClass = Class.forName("oracle.jdbc.pool.OracleDataSource");
//				Method m = concreteClass.getDeclaredMethod("createConnectionBuilder");
//				m.setAccessible(true);
//				
//				
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			} catch (NoSuchMethodException e) {
//				
//				e.printStackTrace();
//			} catch (SecurityException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			//
			Url = "  jdbc:oracle:thin:@(DESCRIPTION =" + "  (LOAD_BALANCE=on)"
					+ "    (ADDRESS = (PROTOCOL = TCP)(HOST = rmodadev-scan)(PORT = 1521))" + "        (CONNECT_DATA ="
					+ "      (SERVER = DEDICATED)" + "      (SERVICE_NAME = odatestdb)" + "    )" + "  ) ";
			pds = PoolDataSourceFactory.getPoolDataSource();
			pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
			pds.setURL(Url2);
			pds.setUser(userName);
			pds.setPassword(password);
			pds.setInitialPoolSize(5);
//			ods.createConnectionBuilder();
//			pds.setURL("jdbc:oracle:thin@(DESCRIPTION= " + "(LOAD_BALANCE=on)" +
//					"(ADDRESS=(PROTOCOL=TCP)(HOST=rmodavm.itamana.net) (PORT=1545))" +
//					"(ADDRESS=(PROTOCOL=TCP)(HOST=rmodavm.itamana.net) (PORT=1545))" +
//					"(CONNECT_DATA=(SERVICE_NAME=odatestdb) (SERVICE_NAME = odatestdb) ))");

			pds.setConnectionPoolName(poolName);
			pds.setFastConnectionFailoverEnabled(true);
			pds.setDatabaseName(userName);
//			pds.setONSConfiguration("nodes=racnode1:4200,racnode2:4200\nwalletfile=" + "/oracle11/onswalletfile");
			pds.setValidateConnectionOnBorrow(true);
//			if(pds.cre) {
//				System.out.println("this pool is exist");
//			}
//			Properties prop = new Properties();
//			prop.put("oracle.jdbc.DRCPConnectionClass", "HR-Pool1");
//			pds.setConnectionProperties(prop);
			pds.setSecondsToTrustIdleConnection(10000);
//			System.out.println(pds.getONSConfiguration());

			if (mgr.getConnectionPoolNames().length > 0) {

				System.out.println("we already have connection pool");
				for (String s : mgr.getConnectionPoolNames()) {
					System.out.println(s);
				}
			} else {

				mgr.createConnectionPool((UniversalConnectionPoolAdapter) pds);
			}
			mgr.startConnectionPool(poolName);
			System.out.println(pds.getAvailableConnectionsCount() + "   ---    ");
			connection = pds.getConnection();
			System.out.println(connection.isValid(1000));

//			pds.getConnectionPoolName();
			int totalConnsCount = pds.getStatistics().getTotalConnectionsCount();
			System.out.println("The total connections information: " + totalConnsCount + ".");
//			String fcfInfo = ((OracleJDBCConnectionPoolStatistics) pds.getStatistics()).getFCFProcessingInfo();

//			System.out.println("The FCF information: " + fcfInfo + ".");

//			Long affF = ((OracleJDBCConnectionPoolStatistics) pds.getStatistics()).getFailedAffinityBasedBorrowCount();
//			System.out.println("The connection affinity failure rate is: " + affF + ".");

//			return connection;
		} catch (SQLException sqlexc) {
//			if (connection == null || !((ValidConnection) connection).isValid()) {
//				// take the appropriate action
//				System.out.println();
//				connection.close();
			mgr.stopConnectionPool(poolName);
			sqlexc.printStackTrace();
//			}
//			System.out.println(sqlexc);

		} finally {
			mgr.destroyConnectionPool(poolName);
		}
		// Example 9-1 Fast Connection Failover Configuration Example
//		return connection;

	}

}
