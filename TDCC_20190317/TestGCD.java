
public class TestGCD {
	public static void main(String [] args) {
		/* 計算兩個數字的最大公因數 greatest common divisor，gcd
		*  利用輾轉相除法
		*/
		System.out.println("calculate gcd : "+ gcd(100, 20));
		
	}
	public static int gcd(int a ,int b) {
		int big = a > b ? a : b;
		int small = a < b ? a : b;
		if(big % small == 0) {
			return small;
		}else {
			return gcd(big % small , big);
		}
	}
}
