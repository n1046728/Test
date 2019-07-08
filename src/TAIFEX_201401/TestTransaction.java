package TAIFEX_201401;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//題目四：
//富裕銀行欲製作一簡單功能的匯款交易系統，下列為 Windows Form 中所建立表單介面
//每個物件的命名：
//（一）當啟動表單時，在「轉出帳號」與「轉入帳號」中便存在所有客戶帳號，表單載
//入時執行 ShowData()此事件，部分程式內容如下，請完成方框內程式：【10 分】
//void ShowData()
//{
//using (SqlConnection cn = new SqlConnection())
//{
//	 write code
//}
//}

//（二）選取「轉出帳號」、「轉入帳號」與「轉出金額」後，按下「轉帳」鈕時，若轉帳
//成功，則顯示「轉帳成功」，並在帳戶餘額內即時更新金額，下列為部分程式內
//容，在不考慮其他異常狀況下，請完成下列方框內程式：
//1.建立 SqlCommand 物件 selectCmd1，用來查詢使用者帳號是否存在。【5 分】
//2.取得使用者的餘額並定給 myMoney。【5 分】
//3.使用者帳號扣款的 SQL 語法。【5 分】
////按下 [轉帳] 鈕執行此事件
//private void button1_Click(object sender, EventArgs e)
//{
//int income;
//using (SqlConnection cn = new SqlConnection(cnstr))
//{
//cn.Open();
////建立 SqlCommand 物件 selectCmd1，用來查詢使用者帳號是否存在
//1.
////傳回 SqlDataReader 物件 dr1，用來查詢使用者帳號是否存在
//SqlDataReader dr1 = selectCmd1.ExecuteReader();
////取得使用者的餘額並定給 myMoney
//2.
//dr1.Close(); // 關閉 SqlDataRader 物件 dr1
////建立 SqlTransaction 交易物件 tran
//SqlTransaction tran = cn.BeginTransaction();
//try
//{
////使用者帳號扣款的 SQL 語法
//3.
//}
//ShowData();
//}
//}

public class TestTransaction {
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
	private static String user ="sa";
	private static String password="123456";
	private static String url="jdbc:sqlserver://servername;databaseName=TSQL";
    
	public static void main(String [] args) {
		showData();
		transfer("2689350","2673842",3000);
		System.out.println("---------------------");
		showData();
	}
	public static void showData() {
		loadDriver();
		
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			String command = "select * from BankAccount ; ";
			//use statment
			//Statement stmt =con.createStatement();
			//ResultSet rs = stmt.executeQuery(command);		
			
			//use prepareStatment
			PreparedStatement pstmt = con.prepareStatement(command);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.printf("%s - %s - %s%n",rs.getString("account"),rs.getString("name"),rs.getInt("balance"));
			}
			rs.close();
			//stmt.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			System.out.println("other exception");
			e.printStackTrace();
		}
	}
	public static void transfer(String acc1,String acc2,int money) {
		loadDriver();
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 =null;
		String command="select count(*) from BankAccount where account= ? or account=?; ";
	    String command1="select * from BankAccount where account= ?; ";
	    String command2="update BankAccount Set balance = ? where account =? ;";
		try {
	    	con = DriverManager.getConnection(url,user,password);
			pstmt =con.prepareStatement(command);
			pstmt.setString(1, acc1);
			pstmt.setString(2, acc2);

			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			//check account exist
			if(rs.getInt(1) !=2)
				return;
			pstmt.close();
			
			//get account balance
			pstmt =con.prepareStatement(command1);
			pstmt.setString(1, acc1);
			ResultSet rs1 = pstmt.executeQuery();
			rs1.next();
			int acc1Balance = rs1.getInt("balance");
			rs1.close();
			pstmt.close();
			
			pstmt =con.prepareStatement(command1);
			pstmt.setString(1, acc2);
			ResultSet rs2 = pstmt.executeQuery();
			rs2.next();
			int acc2Balance = rs2.getInt("balance");
			rs2.close();
			pstmt.close();
			
			acc1Balance -= money;
			acc2Balance += money;
			if(acc1Balance <0 || acc2Balance<0) {
				System.out.println("account 小於零");
				return;
			}
			
			//transaction
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(command2);
			pstmt.setInt(1, acc1Balance);
			pstmt.setString(2, acc1);
			
			pstmt2 = con.prepareStatement(command2);
			pstmt2.setInt(1, acc2Balance);
			pstmt2.setString(2, acc2);
			
			pstmt.executeUpdate();
			pstmt2.executeUpdate();
			
			con.commit();
			
		}catch(Exception e ) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	private static void loadDriver() {
	    try {
			Class.forName(driver);
		}catch (ClassNotFoundException e) {
			System.out.println("driver not found");
			e.printStackTrace();
	
		}
	}
}
