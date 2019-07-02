package EXIMB_201901;

import java.io.Console;
import java.util.Scanner;

public class TestIfElse {
//	（三）一般的電影分級可分為普通級（一般民眾可以觀賞），保護級（6-12 歲可以觀賞），
//	輔導級（13-18 歲可以觀賞）及限制級（18 歲以上可以觀賞），輸入及輸出範例
//	如下，請完成下列方塊中的程式片段。【10 分】
//	輸入及輸出：
//	Enter the Age:
//	13
//	可以看輔導級、保護級及一般級電影
//	程式片段如下：
//	using System;
//	public class Program{
//	 public void Main(string[] args)
//	 {
//	 int age;
//	 Console.WriteLine("Enter the Age: ");
//	 age = int.Parse(Console.ReadLine());
//	  ---------------- 
//	 |                |
//	  ----------------
//	 Console.ReadLine();
//	 }
//	 }
	public static void main(String[] args) {
		int age;
		System.out.println("Enter the age : ");
		Scanner sc = new Scanner(System.in);
//		Console console = System.console();
//		String str = console.readLine(); 
//		age =Integer.parseInt(str);
		age = sc.nextInt();
		StringBuffer buffer = new StringBuffer("可以看");
		if(age>=6 && age <=12)
			buffer.append("保護級,");
		else if(age>=13 && age <=18)
			buffer.append("輔導級,");
		if(age>=18)
			buffer.append("限制級,");
		buffer.append("及一般級電影");
		
		System.out.println(buffer);
	}	

}
