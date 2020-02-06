package FCB_201901;

public class NonChoice2_TestDateConvertToChineseFormat {
//	第二題：
//	以 C++語言設計一程式，將輸入的西式日期轉成中文格式輸出，程式須符合下列要項。【20 分】
//	 顯示"請輸入日期 (mm/dd/yyyy)："
//	 使用者輸入日期後（例如：04/27/2019），輸出"中文日期格式：二O一九年四月二十七日"
//	 main 函數中定義一個名為"cov"的一維陣列作為數字轉換成國字的對照表，起始為O、一、二、…、
//	十；另外定義一個名為"date"一維陣列存放輸入的字串。提醒：數字"0"ASCII CODE 碼的值為 48。
//	 輸入的西式日期存入一維陣列 date 後，呼叫並傳遞 date 陣列給 covertDate 函數。
//	 設計 covertDate 函數，將收到的西元日期利用 cov 陣列對照表轉換成中文日期輸出。
		
	String [] cov= {"O","一","二","三","四","五","六","七","八","九","十"};
	
	public static void main(String[] args) {	
//		System.out.println("請輸入日期(mm/dd/yyyy):");
//		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
		String input ="01/01/2017";
		String date [] =input.split("/");
		System.out.println(coverDate(date));
		System.out.println(coverDate("12/12/2018".split("/")));//二O一七年一月一日
		System.out.println(coverDate("6/6/2018".split("/")));//二O一八年十二月十二日
	}
	public static String coverDate(String[] date) {
		String [] cov= {"O","一","二","三","四","五","六","七","八","九","十"};
		StringBuilder builder = new StringBuilder();
		String [] strs = {"日","月","年"};
		swap(date,0,1);
		for(int i = date.length-1;i>=0;i--) {
			char [] chars = date[i].toCharArray();
			for(int j = 0 ;j<chars.length;j++) {
				//int index = Character.getNumericValue(chars[j]);
				int index = chars[j] -48;

				if(j==0 && (index ==0 ||index == 1 ))
					continue;
				if(chars.length==2 && j==1 && chars[0] !=48) 
					builder.append("十");
				
				builder.append(cov[index]);
			}
			
			builder.append(strs[i]);
		}
		return builder.toString();
	}
	private static void swap(String[] date, int i, int j) {
		String temp = date[i];
		date[i] = date[j];
		date[j] = temp;		
	}

}
