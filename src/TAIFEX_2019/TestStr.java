package TAIFEX_2019;

public class TestStr {
	/* 輸入一組數字能夠反轉輸出
	 * 例如-125 -> -521
	 */
	public static void main(String[] args) {
		System.out.println(reverse(-125));
		System.out.println(reverse(125));
	
	}
	public static int reverse(int number){
		String str = Integer.valueOf(number).toString();
		char init = str.charAt(0);
		String rtnStr = "";
		char [] arr = str.toCharArray();
		if(arr.length ==1)
			return number;
		
		if(init <48 || init >57){
			rtnStr += init;
			for(int i = arr.length-1;i>0;i--){
				rtnStr+=arr[i];
			}
		}else{
			for(int i = arr.length-1;i>=0;i--){
				rtnStr +=arr[i];
			}
		}
		return Integer.parseInt(rtnStr);
	}
}
