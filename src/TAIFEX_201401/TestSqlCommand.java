package TAIFEX_201401;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//題目三：
//豐盛證券公司欲製作一簡單功能的股票交易量查詢系統，下列為 Windows Form 中所建
//立表單介面每個物件的命名：
//（一）當按下「計算」鈕時，執行 SQL Server 指令，將 StockTrade 資料庫中的 Trade 資
//料表（如下左圖）內容彙整到 Stock 資料表內（如下右圖），此按鈕部分程式內
//容如下，請完成方框內程式：【10 分】
//private void BtnCalculate_Click(object sender, EventArgs e)
//{
//		using (SqlConnection cn = new SqlConnection())
// 		{
// 			try
// 			{
// 				cn.ConnectionString = @"Data Source=(LocalDB)\v11.0;" +
// 				"AttachDbFilename=|DataDirectory|StockTrade.mdf;" +
// 				"Integrated Security=True";
// 				SqlCommand cmd = ;
// 					cn.Open();
// 					cmd.ExecuteNonQuery();
// 					cn.Close();
// 			}
// 			catch (Exception ex)
// 			{
// 				MessageBox.Show(ex.Message);
// 			}
// 		}
// }
public class TestSqlCommand {
	
	public static void main(String[] args) {
		//三、(一)計算
		
		//BtnCalculate_Click();
		
		//三、(二) 
		
//-------create stored procedure------//
//		CREATE PROCEDURE GetStockByQty
//			@MIN int,@MAX int 
//		AS
//		BEGIN
//			SET NOCOUNT ON;
//			SELECT * FROM Stock
//			WHERE volumne > @MIN AND volumne <@MAX
//			ORDER BY volumne desc
//		END
//		GO
		
		BtnOk_Click(2,15);

	}
	public static void BtnCalculate_Click() {
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://xxx.xxx.xxx.xxx:1433;databaseName=myDbName";
		String url2 = "jdbc:sqlserver://servername;databaseName=TSQL";
		String user = "sa";
		String password = "1qaz2wsx";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(url2, user, password);
			String command ="UPDATE Stock "
					+ "SET high=A.high,low = A.low,volumne=A.volumne "
					+ "FROM (SELECT stock_code,MAX(trade_price) high,MIN(trade_price) low,SUM(volumne) volumne "
					+ "FROM Trade "
					+ "Group by stock_code) AS A "
					+ "WHERE Stock.stock_code = A.stock_code ";
			//System.out.println(command);
			PreparedStatement ps = con.prepareStatement(command);
					  
			int rs = ps.executeUpdate();
			System.out.println("異動筆數 : "+rs);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void BtnOk_Click(int min ,int max) {
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://xxx.xxx.xxx.xxx:1433;databaseName=myDbName";
		String url2 = "jdbc:sqlserver://servername;databaseName=TSQL";
		String user = "sa";
		String password = "1qaz2wsx";
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(url2, user, password);
			CallableStatement cstmt =con.prepareCall("exec GetStockByQty ?,?");
			cstmt.setInt(1, min);
			cstmt.setInt(2, max);
			System.out.println(cstmt);
					  
			ResultSet rs = cstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("stock_code"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
