package MEGABANK_201901;

import java.util.Scanner;

public class TestIfElse {
	 public static void main(String [] args){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("你們那邊8月平均溫度多少啊?");
		 int temprature = sc.nextInt();
		 if(temprature>90)
			 System.out.println("超級熱的啦");
		 
		 System.out.println("你們那邊8月濕度多少啊");
		 int humidity = sc.nextInt();
		 if(temprature >90 && humidity>50)
			 System.out.println("你們那邊超濕熱的啦");
	 }
}
