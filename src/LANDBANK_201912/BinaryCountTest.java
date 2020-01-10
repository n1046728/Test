package LANDBANK_201912;

public class BinaryCountTest {
//	第三題：
//	請回答下列問題：
//	（一）此問題請用 C++或 C#做答。如果一個整數變數是 32 位元，請設計一程式，讓
//	使用者輸入一個整數值，並且將此整數值中含有多少個二進位的「1」列印出來。
//	例如當使用者輸入值為「40(10)」=「00000000000000000000000000101000(2)」
//	時，則輸出結果為 2。【10 分】
	public static void main(String[] args) {
		int input =40;
		System.out.println(Integer.bitCount(input));//2
		System.out.println(Integer.toBinaryString(input));//101000
		System.out.println(bitCalculate(Integer.toBinaryString(input)));//2
	}
	
	private static int bitCalculate(String binaryStr) {
		char [] arr = binaryStr.toCharArray();
		int sum =0;
		for(char c : arr) {
			sum+= (int)c-48; //數字0 asii為48
		}
		return sum;
	}
}
