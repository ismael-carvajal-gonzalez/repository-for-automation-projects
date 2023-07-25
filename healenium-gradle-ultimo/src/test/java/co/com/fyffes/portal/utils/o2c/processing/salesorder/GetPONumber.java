package co.com.fyffes.portal.utils.o2c.processing.salesorder;

import co.com.fyffes.portal.utils.ConnectDbFyffes;
import co.com.fyffes.portal.utils.OrderInfo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class GetPONumber {

	/* Obtain a PO Number to be assigned to a Sales Order Number  */
	public String getPoNum() throws SQLException {
		AssignPO assignpo = new AssignPO();
		String po_number = null;
		String order_number = (String) assignpo.getOrder().get(0);
		System.out.println("Ismael Order NUmber getPoNum: " + order_number);
		ConnectDbFyffes conect = new ConnectDbFyffes();
		Connection conn_f = conect.connectDb();
		String sql = "SELECT A.poNumber, fts.ORDER_NUMBER, * FROM dbo.FYF_EDI_PO_HEADERS A LEFT JOIN dbo.FYF_EDI_CUSTOMER_ADDRESSES B on A.shipToID = B.id INNER JOIN fin_test.dbo.SALES_ORDER_HEADERS fts ON fts.ORDER_NUMBER = "
				+ "'"+order_number+"'"
				+ "WHERE orderStatus = '' and A.division = '00' and A.masterID = (SELECT id from dbo.FYF_EDI_PO_HEADERS where id = A.masterID and orderStatus = '') order by A.poNumber desc";
        Statement statement = conn_f.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while(result.next()) {
        	po_number =  result.getString("poNumber");

        }
        conn_f.close();
        return "//*[text()=\" "+po_number+" \"]";
	}

	/* Get a new PO Number to modify the current PO of a Sales Order Number  */
	public static String getNewPoNum() throws SQLException {
		String po_number = null;
		ChangePO changepo = new ChangePO();
		List<OrderInfo> orderList = changepo.getOrder();
		String sys_doc_id = orderList.get(1).getSysDocumentId();
		System.out.println("Sys_doc_id " + sys_doc_id);
		String customer_number = orderList.get(1).getCustomerNumber();
		System.out.println("Customer_number " + customer_number);

		ConnectDbFyffes conect = new ConnectDbFyffes();
		Connection conn_f = conect.connectDb();
		String sql = "SELECT TOP 10 A.poNumber FROM  dbo.FYF_EDI_PO_HEADERS A LEFT JOIN fyffesna_test.dbo.FYF_EDI_CUSTOMER_ADDRESSES B on A.shipToID = B.id "
				+ "WHERE orderStatus = '' and A.division = '00' and A.customerNumber = "
				+ "'"+customer_number+"'"
				+ "and A.shipToID = (SELECT shipToID FROM dbo.FYF_EDI_PO_HEADERS WHERE id = "
				+ sys_doc_id //Si está funcionando esta variable
				+ ")"
				+ "and A.masterID = (SELECT id from dbo.FYF_EDI_PO_HEADERS where id = A.masterID and orderStatus = '') order by A.poNumber desc";
		Statement statement = conn_f.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			po_number =  result.getString("poNumber");

		}

		conn_f.close();
		if(po_number !=null) {
			return po_number;
		}else{
			return "1";
		}
	}


}
