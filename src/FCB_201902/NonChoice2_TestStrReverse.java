package FCB_201902;

import java.util.Scanner;

public class NonChoice2_TestStrReverse {
//	請以C++語言或 Java 設計一程式，且滿足下列條件和功能：
//	.程式至少需運用一種迴圈指令，例如while迴圈或for迴圈。
//	.顯示一訊息"請輸入評估值："，評估值為十進位正整數。
//	.將評估值的偶數位數和與奇數位數和相減取絕對值定義為"奇偶差值"。輸出"奇偶差值為："。例如：
//		"137245"，偶數位數和：1+7+4=12，奇數位數和：3+2+5=10，奇偶差值為：2。
//	.輸入和輸出之範例如下：【20分】
//	output：
//	請輸入評估值：137245
//	奇偶差值為：2
	public static void main(String[]args) {
		System.out.print("請輸入評估值：");
//		使用IDE時沒有主控台，取不到Console物件
//		https://openhome.cc/Gossip/JavaGossip-V1/Console.htm
//		Console console = System.console();
//		String input = console.readLine();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char [] inputs = input.toCharArray();
		int odd=0;
		int even=0;
//		char to int
//		https://www.javatpoint.com/java-char-to-int
//		https://www.itread01.com/content/1548501692.html
		for (char c : inputs) {
			int num = Character.getNumericValue(c);
			//System.out.println((int)c);
			
			if(num%2==0)//c%2
				even+=num;//even+=c
			else
				odd+=num;//odd+=c
		}
		System.out.println("even:"+even);
		System.out.println("odd:"+odd);
		System.out.println("奇偶差值為："+ (even-odd));
	}
}
