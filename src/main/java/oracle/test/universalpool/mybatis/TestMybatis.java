package oracle.test.universalpool.mybatis;

import java.io.IOException;
import java.util.Iterator;

import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.session.SqlSessionFactory;

import com.dbcall.procedure.MyModel;

import oracle.test.universalpool.mybatis.samples.factory.CustomSqlSessionFactoryBuilder;

public class TestMybatis {
	private static CustomSqlSessionFactoryBuilder customSqlSessionFactoryBuilder = null; 
	public static void main(String [] args) throws IOException {
	 customSqlSessionFactoryBuilder = new CustomSqlSessionFactoryBuilder();
	 
	 SqlSessionFactory sqlSesFactory = customSqlSessionFactoryBuilder.create();
	 
	 Cursor<MyModel> cursorMyModel =  sqlSesFactory.openSession().selectCursor("");
	 Iterator<MyModel> itMyModel = cursorMyModel.iterator();
	 
	 while(itMyModel.hasNext()) {
		 System.out.println(itMyModel.next().toString());
	 }
	}
	
	

}
