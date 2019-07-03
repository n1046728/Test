package EXIMB_201901;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestCaesarCipher {
//	第一題：
//	請以 C#設計一程式，具下列功能：【30 分】
//	1.顯示訊息"請輸入欲轉換檔案名稱："，請使用者輸入欲轉換之檔案名稱。
//	2.讀取第 1 項指定之檔案名稱，並開啟該檔案準備讀取資料。
//	3.新建儲存處理後資料的檔案，其檔案名稱限制為使用者在第 1 項輸入之檔名之後加
//	"cipher.txt"，例如：第 1 項輸入檔名為"plain.txt"，此輸出檔案名稱即為"plaincipher.txt"。
//	4.指定之輸入檔案中均為由"A"至"Z"等字母所構成之資料，程式需將每一字母逐一讀入
//	後，轉換成依字母順序排列之後的第三個字母，再寫入緩衝區，例如："A"換成"D"、
//	"B"換成"E"、"W"換成"Z"、"X"換成"A"、"Y"換成"B"、"Z"換成"C"。在程式中每一字母
//	之轉換限制以數學公式計算取得，不可以用對照表方式轉換。"A"至"Z"之內碼轉成十
//	進位依序為 65 至 90 的整數。
//	5.將緩衝區暫存之轉換後的資料寫入在第 3 項新建之檔案中。
	public static void main(String[] args) throws IOException {
		int shift = 3;
		
		File file = new File("C:/plain.txt");
		String [] filenames = file.getName().split("\\.");
		FileWriter writer = new FileWriter("C:\\"+filenames[0]+"cipher."+filenames[1]);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			char[] chars = sc.nextLine().toCharArray();
			StringBuffer buffer = new StringBuffer();
			for(int i =0 ;i<chars.length;i++) {
				if(chars[i] >='A' && chars[i]<='Z') {
					chars[i] = (char) (chars[i]+shift);
					if(chars[i] >'Z')
						chars[i] = (char)((chars[i] -65)% 26 +65);
				}
				buffer.append(chars[i]);
			}
			System.out.println("buffer : "+buffer);
			writer.append(buffer);
			writer.append("\r\n");
		}
		//writer.flush();
		writer.close();
	}

}
