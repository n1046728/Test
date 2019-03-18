
public class TestFibonacci {
	public static void main(String [] args) {
		/* 請利用遞迴的方式撰寫費式數列
		*  f0 = 0 ，f1 = 1
		*  formula : fn = fn-1 + fn-2
		*/
		
		System.out.println("fib :　"+fib(1));
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233....
		
	}
	public static int fib(int n ) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
}
