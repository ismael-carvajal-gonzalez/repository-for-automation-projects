package co.com.fyffes.portal.utils.o2c.processing.invoicing;



import co.com.fyffes.portal.utils.ConnectDbRoss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class InvoiceNumEdi {

	/* Obtain a Order Number that Not have PO Assigned  */
	public static String getInvoice() throws SQLException {
		String invoice_number = null;
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 1 A.INVOICE_NUMBER FROM fin_test.dbo.TUR_SOP_INV_HEADERS_SNAPSHOT A INNER JOIN fin_test.dbo.CUSTOMER_ADDRESSES B ON A.COMPANY_CODE = B.COMPANY_CODE "
				     +"AND A.DIVISION = B.DIVISION AND A.CUSTOMER_NUMBER = B.CUSTOMER_NUMBER AND A.INVOICE_ADDRESS_CODE = B.ADDRESS_CODE "
				     +"WHERE A.STATUS_FLAG = ' ' AND B.MESSAGE_CODE = 'EDI' ORDER BY A.INVOICE_NUMBER ASC";
        Statement statement = conn.createStatement(); 
        ResultSet result = statement.executeQuery(sql);
        while(result.next()) {
        	invoice_number = result.getString("INVOICE_NUMBER");
        }
        conn.close();
		return "//*[text()=\""+invoice_number+"\"]";
	}
}
