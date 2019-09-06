package BOT_2017;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//第一題
//EmpFile 資料庫的 Employee 資料表中原本儲存的人員薪資如下表所示。請為經理
//( 加薪 2000 元，副經理 (Deputy_ 加薪 1500 元，其他員工皆加薪 1000 元，
//將加薪後的結果寫回 Employee 資料表，完成後將調整後的結果列出。
//本題程式作答時請以
//JAVA+SQL 或 .NET C#+SQL 擇一進行 。 【 25 分】

//Employee
//資料表：
//E_NO Name Job_Title Salary
//001 Jack Manager 42000
//002 Mary Deputy_Manager 40000
//003 Tom Staff 36000
//004 Nancy Staff 36000
//005 Nakamura Staff 36000
//
//執行結果：
//001 Jack Manager 44000.0
//002 Mary Deputy_Manager 41500.0
//003 Tom Staff 37000.0
//004 Nancy Staff 37000.0
//005 Nakamura Staff 37000.0

public class TestORM_JDBC {
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String user = "sa";
	private static String password ="";
	private static String url="jdbc:sqlserver://;databaseName=TSQL";
	
	private static void loadDriver() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("driver not found");
			e.printStackTrace();
		}
	}
	
	
	public static void main(String []args) {
		loadDriver();
		
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			String command = "select * from Employee ;";
			PreparedStatement pstmt = con.prepareStatement(command);
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("%s - %s - %s -%d%n",rs.getString("E_NO"),rs.getString("Name"),rs.getString("Job_Title"),rs.getInt("Salary"));
				
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
