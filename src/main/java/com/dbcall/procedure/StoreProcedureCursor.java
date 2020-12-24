package com.dbcall.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleTypes;

public class StoreProcedureCursor {
	
	static String runSP = "{? =  call SSSPC.GET_SERVICE_REQUESTS_STATUS(?) }";

	public static void main(String[] args) {
		getRequestByNumber(100555);
	}

	public static MyModel getRequestByNumber(Integer reqNo) {
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@rmodavm.itamana.net:1545:stage", "ES_RIM",
				"esdmsearim");
				Statement statement = conn.createStatement();
				CallableStatement cs = conn.prepareCall(runSP);) {
			// alternative
			// cs.registerOutParameter(2, Types.REF_CURSOR);
//			cs.registerOutParameter(1, OracleTypes.CURSOR);
			cs.registerOutParameter(1, java.sql.Types.REF_CURSOR);

			// conn.setAutoCommit(false);

//			cs.setString(2, reqNo);
			cs.setInt(2, reqNo);


			// run SP
			cs.execute();

			// get refcursor and convert it to ResultSet
			ResultSet resultSet = (ResultSet) cs.getObject(2);

			int i = 0;
			while (resultSet.getMetaData().getColumnCount() < i) {
				System.out.println(resultSet.getMetaData().getColumnLabel(i));
				i++;
			}

			MyModel modelObj = new MyModel();
			while (resultSet.next()) {

				modelObj.setRequestNo(resultSet.getString("REQUEST_NO"));
				modelObj.setIssuedByUser(resultSet.getString("ISSUED_BY_USER"));
				modelObj.setDirCode(resultSet.getString("DIR_CODE"));
				modelObj.setConfirmedByUser(resultSet.getString("CONFIRMED_BY_USER"));
				modelObj.setRequestStatus(resultSet.getString("REQUEST_STATUS"));
				modelObj.setRequestStaDesc(resultSet.getString("REQUEST_STA_DESC"));

				/*
				 * String requestNo = resultSet.getString("REQUEST_NO"); String issuedByUser =
				 * resultSet.getString("ISSUED_BY_USER"); String dirCode =
				 * resultSet.getString("DIR_CODE"); String confirmedByUser =
				 * resultSet.getString("CONFIRMED_BY_USER"); String requestStatus =
				 * resultSet.getString("REQUEST_STATUS"); String requestStaDesc =
				 * resultSet.getString("REQUEST_STA_DESC");
				 * 
				 */

			

				return modelObj;

			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
