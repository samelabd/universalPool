package oracle.test.universalpool.mybatis;

import java.io.IOException;

import org.apache.ibatis.session.SqlSessionFactory;

public class Query {

	public Query() throws IOException {
		SqlSessionFactory session = new ConnectionManager().create();
		session.openSession().select();
	}
}
