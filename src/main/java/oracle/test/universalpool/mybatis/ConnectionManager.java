package oracle.test.universalpool.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.commons.dbcp2.BasicDataSource;
import org.mybatis.spring.mapper.MapperFactoryBean;
public class ConnectionManager {
	
	

    private String configFile = "mybatis/config/mybatis-config.xml";
    private SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    private String environment = "development";

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

    public void setSqlSessionFactoryBuilder(SqlSessionFactoryBuilder sqlSessionFactoryBuilder) {
        this.sqlSessionFactoryBuilder = sqlSessionFactoryBuilder;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Factory method to create session factory based on config,
     * environment from config and properties file to populate parameters in config ${param}
     */
    public SqlSessionFactory create() throws IOException {
        InputStream inputStream = null;
        Properties properties = null;
        inputStream = Resources.getResourceAsStream(configFile);
        properties = Resources.getResourceAsProperties("mybatis/config/mybatis.properties");
        return sqlSessionFactoryBuilder.build(inputStream, environment, properties);
    }
	
	TransactionFactory transactionFactory =
	  new JdbcTransactionFactory();
//	Environment environment =
//	  new Environment("development", transactionFactory, dataSource);
//	Configuration configuration = new Configuration(environment);
//	configuration.addMapper(BlogMapper.class);
//	SqlSessionFactory sqlSessionFactory =
//	  new SqlSessionFactoryBuilder().build(configuration);
	
	
	

}
