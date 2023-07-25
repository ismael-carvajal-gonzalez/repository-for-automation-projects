package co.com.fyffes.portal.utils.operations.processing;

import co.com.fyffes.portal.utils.ConnectDbRoss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ReceiveShipment {

		/* Obtain Warehouse and Room  */
		public static Vector getWarehouseLoc() throws SQLException {	
		Vector v = new Vector();
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 10 WAREHOUSE, ROOM " +
				"FROM ( " +
				"    SELECT WAREHOUSE, WAREHOUSE_DESCRIPTION AS ROOM, " +
				"           ROW_NUMBER() OVER (ORDER BY WAREHOUSE) AS RowNumber " +
				"    FROM WAREHOUSE_CONTROLS " +
				") AS RankedResults " +
				"WHERE RowNumber = 3";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		System.out.println("ReceiveShipment Result Ismael " + result);
			if (result.next()) {
				do {
					System.out.println("Ismael entro en el Do");
					v.add(result.getString("WAREHOUSE"));
					v.add(result.getString("ROOM"));
				} while (result.next());
			}
			System.out.print("V.Elements ReceiveShipment: ");
			System.out.println("Size ReceiveShipment" + v.size());
			for(int i=0; i<v.size(); i++){
				System.out.println("V.Get Ismael ReceiveShipment: " + v.get(i) + " ");
			}
			System.out.println();

			System.out.println("Vector Ismael EJEMPLO2 ReceiveShipment: " + v);
		conn.close();
		return v;
	}

	/*Get Pallet Number with a single line*/
	public static Vector getPalletNumSingleLine() throws SQLException {
		Vector v = new Vector();
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 1 SUBSTRING(TUR_PALLET_ID, 10, 20) AS PALLET,(A.WAREHOUSE+' - '+W.WAREHOUSE_DESCRIPTION) AS WAREHOUSE "
				+"FROM (SELECT SUBSTRING(TUR_PALLET_ID, 10, 20) AS PALLET,WAREHOUSE AS WAREHOUSE FROM dbo.TUR_LOT_STATUS_PALLET_CONT)A, "
				+"TUR_LOT_STATUS_PALLET_CONT B,WAREHOUSE_CONTROLS W WHERE A.PALLET = SUBSTRING(B.TUR_PALLET_ID, 10, 20) "
				+"AND W.WAREHOUSE = A.WAREHOUSE GROUP BY TUR_PALLET_ID,A.WAREHOUSE,W.WAREHOUSE_DESCRIPTION HAVING COUNT(*) = 1";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while(result.next()) {
			v.add(result.getString("PALLET"));
			v.add(result.getString("WAREHOUSE"));
		}
		conn.close();
		return v;
	}

}
