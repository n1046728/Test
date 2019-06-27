package FCB_201901;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.apache.commons.lang.time.DateUtils;

public class TestString {
//	第二題：
//	以 C++語言設計一程式，將輸入的西式日期轉成中文格式輸出，程式須符合下列要項。【20 分】
//	 顯示"請輸入日期 (mm/dd/yyyy)："
//	 使用者輸入日期後（例如：04/27/2019），輸出"中文日期格式：二一九年四月二十七日"
//	 main 函數中定義一個名為"cov"的一維陣列作為數字轉換成國字的對照表，起始為、一、二、…、
//	十；另外定義一個名為"date"一維陣列存放輸入的字串。提醒：數字"0"ASCII CODE 碼的值為 48。
//	 輸入的西式日期存入一維陣列 date 後，呼叫並傳遞 date 陣列給 covertDate 函數。
//	 設計 covertDate 函數，將收到的西元日期利用 cov 陣列對照表轉換成中文日期輸出。
	
	String[]cov={"零","一","二","三","四","五","六","七","八","九","十"};
	public static void main(String[] args) {
//		System.out.println("請輸入日期 (mm/dd/yyyy)：");
//		Scanner sc = new Scanner(System.in);
//		String input =  sc.nextLine();
//		covertDate(input);
		covertDate("12/11/2008");

	}
	public static void covertDate(String input){
		String[]cov={"零","一","二","三","四","五","六","七","八","九","十"};
		String [] dates = input.split("/");
		dates[2] = dates[2].substring(2, 4);
		System.out.println(dates[2]);
		StringBuffer buffer = new StringBuffer();
		//test array is correct
//		for(int i = 0 ;i<dates.length;i++){
//			System.out.println(dates[i] + " , "+checkDateItemLen(dates[i]));
//		}
				
		if(checkDateItemLen(dates[2])==2)
			buffer.append(cov[Integer.parseInt(dates[2].substring(0, 1))] 
					+ cov[Integer.parseInt(dates[2].substring(1, 2))]+"年" ); 
		else
			buffer.append(cov[0] + cov[Integer.parseInt(dates[2].substring(1, 2))] +"年") ; 
		
		
		if(checkDateItemLen(dates[1])==2)
			buffer.append("十" + cov[Integer.parseInt(dates[1].substring(1, 2))]+"月" ) ; 
		else
			buffer.append(cov[Integer.parseInt(dates[1].substring(1, 2))]+"月" ) ;;
		
		
		if(checkDateItemLen(dates[0])==1)
			buffer.append(cov[Integer.parseInt(dates[1].substring(1, 2))]+"日" ) ; 
		else if(checkDateItemLen(dates[0])==2 && dates[0].charAt(0) == 49)
			buffer.append("十"+cov[Integer.parseInt(dates[0].substring(1, 2))]+"日" ) ;
		else
			buffer.append(cov[Integer.parseInt(dates[1].substring(0, 1))]+"十"+cov[Integer.parseInt(dates[1].substring(1, 2))]+"日" ) ;
		
		System.out.println(buffer);
	}
	public static int checkDateItemLen(String str){
		return Integer.valueOf(str).toString().length();
	}
}
