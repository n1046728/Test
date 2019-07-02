package EXIMB_201901;

import java.util.Scanner;

//第四題：
//請利用 C#撰寫下列程式：
//（一）下列程式要求使用者輸入一個正整數，並列印出此一數所有的因數，輸入及輸出
//的範例如下，請完成下列程式中的空白方塊程式片段。（注意：請用迴圈完成）
//【10 分】
//輸入及輸出：
//Enter a Number:
//12
//1 is the factor of 12
//2 is the factor of 12
//3 is the factor of 12
//4 is the factor of 12
//6 is the factor of 12
//程式片段如下：
//using System;
//public class Program{
// public void Main(string[] args)
// {
// int m;
// Console.WriteLine("Enter a Number : ");
//	-------------------
// |                   |
//  -------------------
//Console.ReadLine();
// }
// }
public class TestFactor {
	public static void main(String [] args){
		int m;
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		
		getFactor(m);
		
//		System.out.println("------------------");
//		int[] arr = getPrimes(100);
//		StringBuilder buffer = new StringBuilder("質數為：");
//		for(int i =0;i<arr.length;i++) {
//			if(arr[i]==0)
//				buffer.append(i+",");
//		}
//		System.out.println(buffer);
//		System.out.println("==================");
//		int[] arr1 = getPrimesAdvance(100);
//		StringBuilder buffer1 = new StringBuilder("質數為：");
//		for(int i =0;i<arr1.length;i++) {
//			if(arr1[i]==0)
//				buffer1.append(i+",");
//		}
//		System.out.println(buffer1);
		
		//gcd(216,384)、lcm(216,384)
//		System.out.println("gcd(216,384) = "+gcd(216,384));
//		System.out.println("lcm(216,384) = "+lcm(216,384));
	}
	public static void getFactor(int m) {
		for(int i =1 ; i<=m/2 ; i++) {
			if(m % i ==0)
				System.out.println(i +" is the factor of "+m);
		}
	}

	public static int[] getPrimes(int m) {
		//Sieve method
		int [] arr = new int [m];
		arr[0] =1;
		arr[1] =1;
		for(int i=2;i<m;i++) {
			if(arr[i] == 0) {
				int k=2;
				while(i*k < m) {
					arr[i*k] = 1;
					k++;
				}
			}
		}
		return arr;
	}
	public static int[] getPrimesAdvance(int m) {
		//Sieve method
		int root_m =  (int) Math.pow(m, 0.5);
		int [] arr = new int [m];
		arr[0] =1;
		arr[1] =1;
		for(int i=2;i<root_m;i++) {
			if(arr[i] == 0) {
				int k=2;
				while(i*k < m) {
					arr[i*k] = 1;
					k++;
				}
			}
		}
		return arr;
	}
	public static int gcd(int a , int b) {
		int large = a>b?a:b;
		int small = a<b?a:b;
		//System.out.println("large :"+large+",small:"+small);
		return large % small==0?small :gcd(small,large% small);
	}
	public static int lcm(int a ,int b) {
		return a*b/gcd(a,b);
	}
}
