package co.com.fyffes.portal.utils.o2c.processing.debitsandcredits;



import co.com.fyffes.portal.utils.ConnectDbRoss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;


public class GetDebit_Credit_Note {

	/* Obtain a Debit Number, Order Number and Invoice Number */
	public static Vector getDebitNum() throws SQLException {
		Vector v = new Vector();
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 1 DEBITS.TRANSACTION_NUMBER as DEBIT_NUMBER,INVOICES.ORDER_NUMBER as ORDER_NUMBER,INVOICES.INVOICE_NUMBER as INVOICE_NUMBER "
				+"FROM dbo.AR_TRANSACTIONS DEBITS LEFT JOIN dbo.TUR_SOP_INV_HEADERS_SNAPSHOT INVOICES ON DEBITS.COMPANY_CODE = INVOICES.COMPANY_CODE "
				+"AND DEBITS.DIVISION = INVOICES.DIVISION AND DEBITS.CUSTOMER_NUMBER = INVOICES.CUSTOMER_NUMBER AND DEBITS.INVOICE_NUMBER = INVOICES.INVOICE_NUMBER "
				+"LEFT JOIN dbo.CUSTOMER_ADDRESSES CUSTOMER_AD ON INVOICES.COMPANY_CODE = CUSTOMER_AD.COMPANY_CODE AND INVOICES.DIVISION = CUSTOMER_AD.DIVISION "
				+ "AND INVOICES.CUSTOMER_NUMBER = CUSTOMER_AD.CUSTOMER_NUMBER AND INVOICES.INVOICE_ADDRESS_CODE = CUSTOMER_AD.ADDRESS_CODE "
				+ "WHERE TRANSACTION_TYPE = 'DN' AND TUR_PROCESS_STATUS <> 'P' ORDER BY DEBITS.TRANSACTION_NUMBER DESC";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		System.out.println("Result Ismael Debit: " + result);
		if (result.next()) {
			do {
				System.out.println("Ismael entro en el Do");
				v.add(result.getString("DEBIT_NUMBER"));
				v.add(result.getString("ORDER_NUMBER"));
				v.add(result.getString("INVOICE_NUMBER"));
			} while (result.next());
		}
		System.out.print("V.Elements Debit: ");
		System.out.println("Size Debit" + v.size());
		for(int i=0; i<v.size(); i++){
			System.out.println("V.Get Ismael Debit: " + v.get(i) + " ");
		}
		System.out.println();

		System.out.println("Vector Ismael EJEMPLO2 Debit: " + v);
		conn.close();
		System.out.println("V Ismael Debit: " + v);
		return v;
	}

	/* Obtain a Credit Number, Order Number and Invoice Number */
	public static Vector getCreditNum() throws SQLException {
		Vector v = new Vector();
		ConnectDbRoss conect = new ConnectDbRoss();
		Connection conn = conect.connectDb();
		String sql = "SELECT TOP 1 CREDITS.CREDIT_NOTE_NUMBER AS CREDIT_NUMBER,INVOICES.ORDER_NUMBER AS ORDER_NUMBER,INVOICES.INVOICE_NUMBER AS INVOICE_NUMBER "
				+"FROM dbo.SALES_CREDIT_NOTES CREDITS LEFT JOIN dbo.TUR_SOP_INV_HEADERS_SNAPSHOT INVOICES ON CREDITS.COMPANY_CODE = INVOICES.COMPANY_CODE "
				+"AND CREDITS.DIVISION = INVOICES.DIVISION AND CREDITS.CUSTOMER_NUMBER = INVOICES.CUSTOMER_NUMBER AND CREDITS.T_TRANSACTION_NUMBER = INVOICES.INVOICE_NUMBER "
				+"LEFT JOIN dbo.CUSTOMER_ADDRESSES CUSTOMER_AD ON INVOICES.COMPANY_CODE = CUSTOMER_AD.COMPANY_CODE AND INVOICES.DIVISION = CUSTOMER_AD.DIVISION "
				+ "AND INVOICES.CUSTOMER_NUMBER = CUSTOMER_AD.CUSTOMER_NUMBER AND INVOICES.INVOICE_ADDRESS_CODE = CUSTOMER_AD.ADDRESS_CODE "
				+ "WHERE TUR_PROCESS_STATUS <> 'P' AND UPDATE_FLAG = 'C' ORDER BY CREDIT_NUMBER DESC";
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);
		System.out.println("Result Ismael Credit: " + result);
		if (result.next()) {
			do {
				System.out.println("Ismael entro en el Do");
				v.add(result.getString("CREDIT_NUMBER"));
				v.add(result.getString("ORDER_NUMBER"));
				v.add(result.getString("INVOICE_NUMBER"));
			} while (result.next());
		}

		System.out.print("V.Elements Credir: ");
		System.out.println("Size Credit" + v.size());
		for(int i=0; i<v.size(); i++){
			System.out.println("V.Get Ismael Credit: " + v.get(i) + " ");
		}
		System.out.println();

		System.out.println("Vector Ismael EJEMPLO2 Credit: " + v);

		conn.close();
		System.out.println("V Ismael Credit: " + v);
		return v;
	}


}
