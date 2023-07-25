package co.com.fyffes.portal.utils.o2c.processing.supportcreditdocument;

import co.com.fyffes.portal.utils.ConnectDbRoss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class SupportCreditData {

	/* Obtain credit_number, invoice_number and order_number  */
	public static Vector getSupportData() throws SQLException {
		Vector v = new Vector();
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 1 CREDIT_NOTE_NUMBER, INVOICE_NUMBER, ORDER_NUMBER from TUR_SOP_INV_HEADERS_SNAPSHOT A , sales_credit_notes B "
				     +"WHERE A.company_code = B.company_code AND A.division = B.division AND A.CUSTOMER_NUMBER = B.CUSTOMER_NUMBER "
				     +"AND A.INVOICE_NUMBER = B.T_TRANSACTION_NUMBER AND A.DIVISION = '00'";
				     
        Statement statement = conn.createStatement(); 
        ResultSet result = statement.executeQuery(sql);
        while(result.next()) {
        	v.add(result.getString("CREDIT_NOTE_NUMBER"));
        	v.add(result.getString("INVOICE_NUMBER"));
        	v.add(result.getString("ORDER_NUMBER"));
        }
        conn.close();
		return v;
	}

	public static String getCreditNumber() throws SQLException {
		String credit_number = null;
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 1 CREDIT_NOTE_NUMBER, INVOICE_NUMBER, ORDER_NUMBER from TUR_SOP_INV_HEADERS_SNAPSHOT A , sales_credit_notes B "
				+"WHERE A.company_code = B.company_code AND A.division = B.division AND A.CUSTOMER_NUMBER = B.CUSTOMER_NUMBER "
				+"AND A.INVOICE_NUMBER = B.T_TRANSACTION_NUMBER AND A.DIVISION = '00'";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			credit_number = result.getString("CREDIT_NOTE_NUMBER");        }
		conn.close();
		return "//*[text()=\" "+credit_number+" \"]";
	}

}
