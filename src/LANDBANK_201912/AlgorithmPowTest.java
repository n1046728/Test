package LANDBANK_201912;

public class AlgorithmPowTest {
//	請使用指定的程式語言撰寫以下程式：
//	（一）請使用 C#或 C++程式語言撰寫 f(x,n)=1+x+x2+...+xn的程式。【10 分】
	public static void main(String[] args) {
		System.out.println(f(2,10));
	}
	public static double f(int x ,int n) {
		double rtn=0;
		
		for(int i =0;i<=n;i++) {
			rtn += Math.pow(x, i);
		}
		
		return rtn;
	}
}
