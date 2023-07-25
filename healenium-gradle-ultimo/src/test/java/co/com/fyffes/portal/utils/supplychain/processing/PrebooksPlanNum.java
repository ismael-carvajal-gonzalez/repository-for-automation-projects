package co.com.fyffes.portal.utils.supplychain.processing;

import co.com.fyffes.portal.utils.ConnectDbFyffes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrebooksPlanNum {

	/* Obtain Arrival Week  */
	public static String getArrivalWeek() throws SQLException {
		String arrival_week = null;
		ConnectDbFyffes conect = new ConnectDbFyffes();
		Connection conn = conect.connectDb();
		String sql = "WITH ArrivalWeeks AS ("
				+ "  SELECT DISTINCT"
				+ "    'Week: ' + CAST(CAST(PC.weekNumber AS int) AS VARCHAR) AS ARRIVAL_WEEK,"
				+ "    ROW_NUMBER() OVER (ORDER BY CAST(PC.weekNumber AS int) DESC) AS RowNumber"
				+ "  FROM"
				+ "    dbo.FYF_PREBOOK_CONTROL AS PC"
				+ "    INNER JOIN dbo.FYF_PREBOOK_LOADING_PORTS AS PLP ON PC.loadingPortId = PLP.id"
				+ "    INNER JOIN dbo.FYF_PREBOOK_VESSELS AS V ON PC.vesselId = V.id"
				+ "  WHERE"
				+ "    PC.statusFlag = 'O'"
				+ ")"
				+ "SELECT ARRIVAL_WEEK FROM ArrivalWeeks WHERE RowNumber = 3";
        Statement statement = conn.createStatement(); 
        ResultSet result = statement.executeQuery(sql);
		if (result.next()) {
			arrival_week = result.getString("ARRIVAL_WEEK");
		}
		conn.close();
        return "//*[text()=\" "+arrival_week+" \"]";
		
	}
}
