package co.com.fyffes.portal.utils.o2c.processing.salesorder;


import co.com.fyffes.portal.utils.ConnectDbRoss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class AssignPO {

	/* Obtain a Order Number that Not have PO Assigned  */
	public static Vector getOrder() throws SQLException {
		Vector v = new Vector();
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 1 ORDER_NUMBER,A.CUSTOMER_NUMBER FROM dbo.SALES_ORDER_HEADERS A INNER JOIN dbo.CUSTOMER_ADDRESSES B on A.DIVISION = B.DIVISION "
				+"AND A.COMPANY_CODE = B.COMPANY_CODE AND A.CUSTOMER_NUMBER = B.CUSTOMER_NUMBER AND A.INVOICE_ADDRESS_CODE = B.ADDRESS_CODE "
				+"WHERE SYS_DOCUMENT_ID = ''  AND A.CUSTOMER_NUMBER = 'WALMAR' AND B.CUSTOMER_NUMBER = 'WALMAR' AND CUSTOMER_REFERENCE = '' AND A.DIVISION = '00' AND B.MESSAGE_CODE = 'EDI' AND STATUS_FLAG <> 'N' AND TUR_LOCK_FLAG <> 'L' ORDER BY A.GEM_DBKEY DESC";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			do {
				System.out.println("Ismael entro en el Do");
				v.add(result.getString("ORDER_NUMBER"));
				v.add(result.getString("CUSTOMER_NUMBER"));
			} while (result.next());
		}

		System.out.print("V.Elements: ");
		System.out.println("Size " + v.size());
		for(int i=0; i<v.size(); i++){
			System.out.println("V.Get Ismael: " + v.get(i) + " ");
		}
		System.out.println();

		System.out.println("Vector Ismael EJEMPLO2: " + v);
        conn.close();
		return v;
	}

}
