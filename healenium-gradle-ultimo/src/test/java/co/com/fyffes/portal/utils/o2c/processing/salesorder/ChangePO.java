package co.com.fyffes.portal.utils.o2c.processing.salesorder;

import co.com.fyffes.portal.utils.ConnectDbRoss;
import co.com.fyffes.portal.utils.OrderInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ChangePO {

	public ChangePO(){

	}

	/* Obtain a Order Number that have PO */
	/*public static Vector getOrder() throws SQLException {
		Vector v = new Vector();
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT *\n" +
				"FROM (\n" +
				"    SELECT TOP 3 ROW_NUMBER() OVER (ORDER BY A.GEM_DBKEY DESC) AS row_num, \n" +
				"        ORDER_NUMBER, A.DIVISION, SYS_DOCUMENT_ID, A.CUSTOMER_NUMBER\n" +
				"    FROM dbo.SALES_ORDER_HEADERS A \n" +
				"    INNER JOIN dbo.CUSTOMER_ADDRESSES B on A.DIVISION = B.DIVISION \n" +
				"        AND A.COMPANY_CODE = B.COMPANY_CODE AND A.CUSTOMER_NUMBER = B.CUSTOMER_NUMBER \n" +
				"        AND A.INVOICE_ADDRESS_CODE = B.ADDRESS_CODE \n" +
				"    WHERE SYS_DOCUMENT_ID <> ' ' AND SYS_DOCUMENT_ID <> '0' AND A.DIVISION = '00' \n" +
				"        AND B.MESSAGE_CODE = 'EDI' AND STATUS_FLAG <>'N' AND TUR_LOCK_FLAG <>'L' \n" +
				"        AND A.CUSTOMER_NUMBER IN('WALMAR','WAKEFE','ALDIIN') \n" +
				") AS subquery\n" +
				"WHERE subquery.row_num > 2";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			v.add(result.getString("ORDER_NUMBER"));
			v.add(result.getString("SYS_DOCUMENT_ID"));
			v.add(result.getString("CUSTOMER_NUMBER"));
		}
		conn.close();
		return v;
	}*/

	public static List<OrderInfo> getOrder() throws SQLException {
		List<OrderInfo> orderList = new ArrayList<>();
		String sql = "SELECT ORDER_NUMBER, SYS_DOCUMENT_ID, CUSTOMER_NUMBER " +
				"FROM (SELECT ROW_NUMBER() OVER (ORDER BY A.GEM_DBKEY DESC) AS row_num, " +
				"      A.ORDER_NUMBER, A.DIVISION, A.SYS_DOCUMENT_ID, A.CUSTOMER_NUMBER " +
				"      FROM dbo.SALES_ORDER_HEADERS A" +
				"      INNER JOIN dbo.CUSTOMER_ADDRESSES B ON A.DIVISION = B.DIVISION " +
				"                                        AND A.COMPANY_CODE = B.COMPANY_CODE  " +
				"                                        AND A.CUSTOMER_NUMBER = B.CUSTOMER_NUMBER " +
				"                                        AND A.INVOICE_ADDRESS_CODE = B.ADDRESS_CODE " +
				"      WHERE SYS_DOCUMENT_ID <> ' ' " +
				"        AND SYS_DOCUMENT_ID <> '0' " +
				"        AND A.DIVISION = '00'  " +
				"        AND B.MESSAGE_CODE = 'EDI' " +
				"        AND A.STATUS_FLAG <> 'N' " +
				"        AND A.TUR_LOCK_FLAG <> 'L'  " +
				"        AND A.CUSTOMER_NUMBER IN ('WALMAR', 'WAKEFE', 'ALDIIN')" +
				") AS subquery " +
				"WHERE subquery.row_num > 2";
		try (Connection conn = ConnectDbRoss.connectDb();
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(sql)) {
			while (rs.next()) {
				String orderNumber = rs.getString("ORDER_NUMBER");
				String sysDocumentId = rs.getString("SYS_DOCUMENT_ID");
				String customerNumber = rs.getString("CUSTOMER_NUMBER");
				OrderInfo orderInfo = new OrderInfo(orderNumber, sysDocumentId, customerNumber);
				orderList.add(orderInfo);
			}
		} catch (SQLException ex) {
			// Manejo de excepción
			ex.printStackTrace();
			throw ex;
		}
		return orderList;
	}


	/* Obtaine a Order Number that has Confirmated PO  */
	public static String confirmedOrder() throws SQLException {
		String order_number = null;
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 1 ORDER_NUMBER,DIVISION,SYS_DOCUMENT_ID FROM dbo.SALES_ORDER_HEADERS WHERE TUR_LOCK_FLAG = 'L' and SYS_DOCUMENT_ID <> '' and CUSTOMER_REFERENCE <> '' and DIVISION = '00' ORDER BY GEM_DBKEY DESC";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			order_number =  result.getString("ORDER_NUMBER");
		}
		conn.close();
		return order_number;
	}

	/* Get sales order number to be canceled  */
	public static String canceledOrder() throws SQLException {
		String order_number = null;
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "Select TOP 10 ORDER_NUMBER from sales_order_headers A inner join fyffesna_test.dbo.FYF_EDI_PO_HEADERS B on A.SYS_DOCUMENT_ID = B.id where  year(order_date) > '2020' and B.orderStatus <> 'C' and SYS_DOCUMENT_ID <> '' and "
				+ "ORDER_NUMBER not in (select order_number from despatch_notes B where A.order_number = B.order_number and A.DIVISION = B.DIVISION and A.COMPANY_CODE = B.COMPANY_CODE) "
				+ "and A.DIVISION = '00' and ORDER_NUMBER not in (select order_number from EMP_ORDER_HEADER_INTERFACE C where A.order_number = C.order_number and A.DIVISION = C.DIVISION and A.COMPANY_CODE = C.COMPANY_CODE)";

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			order_number =  result.getString("ORDER_NUMBER");
		}
		conn.close();
		return order_number;
	}



}
