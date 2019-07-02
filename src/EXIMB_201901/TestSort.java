package EXIMB_201901;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//第二題：
//請用 C#完成下列程式：C#中的 List 是一可擴充的陣列結構，它可以用來儲存各種資料，
//像是整數值，下列的例子是用來宣告一個空的整數 List：
//List<int> listA = new List<int>();
//請利用 List 結構完成下列工作：
//（一）一開始宣告一個空的整數 List，當使用者輸入 1-99 的正整數，就將此正整數加入
//到 List 中，一直到使用者輸入 999 為止，結束資料的輸入。【9 分】
//（二）將這個 List 中的整數資料排序。【5 分】
//（三）將所有加入到這個 List 中且排序過的資料列印出。【6 分】
//
//輸入輸出範例如下：
//請輸入一個1-99的正整數：
//67
//請輸入一個1-99的正整數：
//6
//請輸入一個1-99的正整數：
//88
//請輸入一個1-99的正整數：
//56
//請輸入一個1-99的正整數：
//999
//所輸入的資料經過排序如下：
//6,56,67,88

public class TestSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int input;
		while(true) {
			System.out.println("請輸入一個1-99的正整數：");
			input = sc.nextInt();
			if(input == 999)
				break;
			list.add(input);
		}
		System.out.println("所輸入的資料經過排序如下：");
		Collections.sort(list);
		//Collections.reverse(list);
		list.forEach(s->System.out.print(s+" "));
	}

}


