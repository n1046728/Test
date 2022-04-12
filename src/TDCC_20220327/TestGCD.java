package Test;

public class TestGCD {
	public static void main(String []args) {

		
		//gcd test assume m>n
		System.out.println(getGCD(12,8));
	}
  
	static int getGCD(int m , int n ) {
		
		int residual = 0;
				
		while(n>0) {
			System.out.println("m % n = "+m % n);
			residual = m % n;
			m = n;
			System.out.println("m="+m);
			n = residual;
		}
		
		
		return m;
		
	}
}
