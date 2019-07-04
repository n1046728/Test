package TAIFEX_201401;
//題目三：
//（二）當按下「查詢」鈕時，必須先輸入「最低成交量」與「最高成交量」，在
//dataGridViewShow 中顯示滿足條件的資料，並依據成交量遞減排列，下圖為執行
//結果。
//1.當執行此按鈕時須先建立 GetStockByQty 預存程序，呼叫此預存程序時須先輸
//入 @QMin 與 @QMax 兩 個 參 數 ， 且 根 據 成 交 量 做 遞 減 排 序 。 請 撰 寫
//GetStockByQty 預存程序的程式內容。【5 分】
//2.此按鈕部分程式內容如下，請完成方框內程式：【10 分】
// private void BtnOk_Click(object sender, EventArgs e)
// {
// 		using (SqlConnection cn = new SqlConnection())
// 		{
// 			try
// 			{
// 				cn.ConnectionString = @"Data Source=(LocalDB)\v11.0;" +
// 				"AttachDbFilename=|DataDirectory| StockTrade.mdf;" +
// 				"Integrated Security=True";
// 				SqlCommand cmd = new SqlCommand();
// 				cmd.Connection = cn;
// 				cmd.CommandText = (1) ;
// 				cmd.CommandType = CommandType.StoredProcedure;
// 				cmd.Parameters.Add( (2) );
// 				cmd.Parameters.Add( (3) );
// 				cmd.Parameters["@QMin"].Value = (4) ;
// 				cmd.Parameters["@QMax"].Value = (5) ;
// 				SqlDataAdapter daStock = new SqlDataAdapter();
// 				daStock.SelectCommand = cmd;
// 				DataSet ds = new DataSet();
// 				daStock.Fill(ds, "Stock");
// 				dataGridViewShow.DataSource = ds.Tables["Stock"];
// 			}
// 			catch (Exception ex)
// 			{
// 				MessageBox.Show(ex.Message);
// 			}
// 		}
// }

public class TestStoredProcedure {
	public static void main(String args[]){
		
	}
}
