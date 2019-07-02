package EXIMB_201901;

import java.util.Arrays;
import java.util.Scanner;

public class TestStr {
//	（二）下列程式中使用者輸入一個正整數，並且將此數以相反順序列印出來，輸入及輸
//	出範例如下，請完成下列方塊中的程式片段。【10 分】
//	輸入及輸出：
//	Enter a Number:
//	123
//	Reserve of Entered Number is : 321
//	程式片段如下：
//	using System;
//	public class Program{
//	 public void Main(string[] args)
//	 {
//	 int num, reverse = 0;
//	 Console.WriteLine("Enter a Number : ");
//	 num = int.Parse(Console.ReadLine());
//	 -----------------
//	|                 |
// 	 -----------------
//	 Console.WriteLine("Reverse of Entered Number is : "+reverse);
//	 Console.ReadLine();
//	 }
//	 }

	public static void main(String[] args) {
		int num,reverse=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = sc.nextInt();
		
		char[] chars = Integer.valueOf(num).toString().toCharArray();
		String str=""; //local variable must be initial
		for(int i = chars.length-1;i>=0;i--){
			str += chars[i];
		}
		
		reverse = Integer.parseInt(str);
		System.out.println("Reverse od Enter Number is : "+reverse);
	}

}
