package LANDBANK_201912;

public class FibonacciTest {
//	第三題：
//	請回答下列問題：
//	（二）此問題請使用 C#、C++、或 Java 中任何一種程式語言。費伯那西數是一個級
//	數，它的第 0 個數的值是 0、第 1 個數的值是 1，此後的每一個數的值為前二
//	個數的值相加，所以第 2 個數的值是 0+1=1，接下來的數的值分別是 2、3、5、
//	8、…，請設計一程式找出大於「100000」之最小費伯那西數，並輸出該數為
//	費伯那西數之第幾個數，且程式即停止執行。【15 分】
	public static void main(String[] args) {
		double stop = 10000;
		int init = 0;
		while(true) {
			double fib = fibonacci(init); 
			if(fib > stop) {
				System.out.println("fib:"+fib+",n:"+init);
				break;
			}
			init++;
		}
		
		stopFibonacci(10000);
	}
	public static double fibonacci(double n ) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void stopFibonacci(double stopNum) {
		double f0 = 0;
		double f1 = 1;
		double fn =f1+f0;
		double n = 1;
		if(stopNum ==0 || stopNum ==1)
			return;
		
		while(true) {
			n++;
			fn=f0+f1;
			System.out.println(fn+" "+f1+" "+f0);
			if(fn>stopNum) {
				System.out.println("fib:"+fn+",n:"+n);
				break;
			}
			f0 =f1;
			f1 = fn;
			
		}
	}
}
