package co.com.fyffes.portal.utils.operations.processing;

import co.com.fyffes.portal.utils.ConnectDbRoss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ConfirmationOfSales {

    public static Vector getOrderNumber() throws SQLException {
        Vector v = new Vector();
        ConnectDbRoss conect = new ConnectDbRoss();
        Connection conn = conect.connectDb();
        String sql = "SELECT TOP 20 ORDER_NUMBER " +
                "FROM ( " +
                "    SELECT ORDER_NUMBER, CUSTOMER_NUMBER, WAREHOUSE, ORDER_QUANTITY, " +
                "           PRODUCT_CLASS = ( " +
                "               SELECT PRODUCT_CLASS FROM dbo.PRODUCT_MASTER " +
                "               WHERE COMPANY_CODE = A.COMPANY_CODE AND PART_CODE = A.PART_CODE " +
                "           ), " +
                "           ROW_NUMBER() OVER (ORDER BY PART_CODE) AS RowNumber " +
                "    FROM dbo.SOP_ORDER_LINES_LINE_QTYS A " +
                "    WHERE COMPANY_CODE ='01' AND WAREHOUSE = '03' " +
                "          AND DIVISION ='00' /*AND ORDER_NUMBER ='CO452412'*/ AND PART_CODE NOT LIKE 'TEMP%' " +
                ") AS RankedResults " +
                "WHERE RowNumber > 25824";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        System.out.println("Order Number Result Ismael " + result);
        if (result.next()) {
            do {
                System.out.println("Ismael entro en el Do");
                v.add(result.getString("ORDER_NUMBER"));
            } while (result.next());
        }
        System.out.print("V.Elements Order Number: ");
        System.out.println("Size Order Number" + v.size());
        for(int i=0; i<v.size(); i++){
            System.out.println("V.Get Ismael Order Number: " + v.get(i) + " ");
        }
        System.out.println();

        System.out.println("Vector Ismael EJEMPLO2 Order Number: " + v);
        conn.close();
        return v;
    }

}
