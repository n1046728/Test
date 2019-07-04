package TAIFEX_201401;

import java.util.HashMap;
import java.util.Map;

//題目二：
//請寫出下列 VB.NET 程式碼執行結果：【25 分】
//Module Module1
// Dim dic As New Dictionary(Of Integer, String)
// Sub Main()
// dic.Add(0, "a")
// dic.Add(1, "b")
// dic.Add(2, "c")
// F(5)
// Console.ReadKey() '本行 debug
// End Sub
// Function F(i As Integer) As Integer
// If i = 0 Then
// Return 0
// ElseIf i = 1 Then
// Return 1
// Else
// Console.Write(dic(i Mod 3))
// Return F(i - 1) + F(i - 2)
// End If
// End Function
//End Module
public class TestFibonacci {
	public static Map<Integer, String> dic =new HashMap<>();
		//靜態初始化區塊，若沒加static則為物件初始化區塊
		static{
			dic.put(0, "a");
			dic.put(1, "b");
			dic.put(2, "c");
		}
	public static void main(String args []) {
		//dic.forEach((u,v)->System.out.println(u+","+v));
		//注意遞迴執行順序左：5->4->3->2->2  右：3->2
		fibonacci(5);
	}
	public static int fibonacci(int i ) {
		if(i ==0)
			return 0;
		else if(i == 1)
			return 1;
		else {
			//System.out.println(i);
			System.out.println(dic.get(i%3));
		}
			
		
		return fibonacci(i-1)+fibonacci(i-2);
		
	}
}

