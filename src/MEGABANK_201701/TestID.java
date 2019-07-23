package MEGABANK_201701;

import java.util.HashMap;
import java.util.Map;
//第一題：
//請使用JAVA 程式語言撰寫程式，以判斷中華民國的身分證字號是否正確。【20 分】
//中華民國的身分證字號有其特定的編碼原則。第一個字是大寫的英文字母，其餘9 個字必須為數字，但在套用編
//碼原則時，第一個英文字母將會先依下表被轉換為數字：

//字母 P Q R S T U V X Y W Z I O
//數字 23 24 25 26 27 28 29 30 31 32 33 34 35
//轉換後的身分證字號（共11 位數字）每一位數均有固定的權重(Weight)，由左往右依序為 『1 9 8 7 6 5 4 3 2 1
//1』。判斷身分證字號是否正確的方法為：各位數字與其相對應的權重相乘後再加總，加總後的結果若為10 的倍數，
//則身分證字號即屬正確。例如：輸入A100000001 身分證為正確，輸入 A200000001 身分證為錯誤。
public class TestID {

	public static void main(String[] args) {
		
		System.out.println(testPersonalID("A200000001"));
	}
	public static boolean testPersonalID(String id) {
		Map<String ,Integer> mapping = getMapping();
		char element = id.charAt(0);
		int [] weights = {1,9,8,7,6,5,4,3,2,1,1};

		System.out.println("element :"+element);
		Integer mappingValue = mapping.get(String.valueOf(element));
		String newID = mappingValue.toString()+id.substring(1);
		char [] arr = newID.toCharArray();
		
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			System.out.printf("arr[i]*weights[i],%s * %d = %d%n",arr[i],weights[i],(arr[i]-48)*weights[i]);
			sum+= (arr[i]-48) * weights[i];
		}
		System.out.println("sum:"+sum);
		return sum %10 ==0?true:false;
	}
	public static Map<String,Integer> getMapping(){
		HashMap<String ,Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 11);
		map.put("C", 12);
		map.put("D", 13);
		map.put("E", 14);
		map.put("F", 15);
		map.put("G", 16);
		map.put("H", 17);
		map.put("J", 18);
		map.put("K", 19);
		map.put("L", 20);
		map.put("M", 21);
		map.put("N", 22);
		map.put("P", 23);
		map.put("Q", 24);
		map.put("R", 25);
		map.put("S", 26);
		map.put("T", 27);
		map.put("U", 28);
		map.put("V", 29);
		map.put("X", 30);
		map.put("Y", 31);
		map.put("W", 32);
		map.put("Z", 33);
		map.put("I", 34);
		map.put("O", 35);
		return map;
	}
}
