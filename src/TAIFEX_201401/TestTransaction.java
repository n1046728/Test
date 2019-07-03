package TAIFEX_201401;
//題目四：
//富裕銀行欲製作一簡單功能的匯款交易系統，下列為 Windows Form 中所建立表單介面
//每個物件的命名：
//（一）當啟動表單時，在「轉出帳號」與「轉入帳號」中便存在所有客戶帳號，表單載
//入時執行 ShowData()此事件，部分程式內容如下，請完成方框內程式：【10 分】
//void ShowData()
//{
// using (SqlConnection cn = new SqlConnection())
// {
//	 write code
// }
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
//// 建立 SqlCommand 物件 selectCmd1，用來查詢使用者帳號是否存在
//1.
//// 傳回 SqlDataReader 物件 dr1，用來查詢使用者帳號是否存在
//SqlDataReader dr1 = selectCmd1.ExecuteReader();
//// 取得使用者的餘額並定給 myMoney
//2.
//dr1.Close(); // 關閉 SqlDataRader 物件 dr1
//// 建立 SqlTransaction 交易物件 tran
//SqlTransaction tran = cn.BeginTransaction();
//try
//{
//// 使用者帳號扣款的 SQL 語法
//3.
//}
//ShowData();
//}
//}


public class TestTransaction {

}
