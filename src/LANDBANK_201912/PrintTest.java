package LANDBANK_201912;

public class PrintTest {
//	請使用指定的程式語言撰寫以下程式：
//	（一）請使用 C#或 C++程式語言撰寫 f(x,n)=1+x+x2+...+xn的程式。【10 分】
//	（二）請使用 C#或 C++或 JAVA 語言撰寫程式以產生下列輸出結果。【15 分】
//	輸出結果：
//	1234321
//	 12321
//	  121
//	   1

	public static void main(String[] args) {
		int n =9 ;
		StringBuffer buffer = new StringBuffer();
		
		for(int i =n;i>0;i--) {
			buffer.append(printSpace(n-i));
			buffer.append(printOneToN(i));
			buffer.append(printNToOne(i-1)+"\n");
		}
		System.out.println(buffer.toString());
	}
	private static String printSpace(int n ) {
		String space ="";
		for(int i =0;i<n;i++) {
			space +=" ";
		}
		return space;
	}
	private static StringBuffer printOneToN(int n ) {
		StringBuffer buffer = new StringBuffer();
		for(int i=1 ;i<=n;i++) {
			buffer.append(i);
		}
		return buffer;
	}
	private static StringBuffer printNToOne(int n ) {
		StringBuffer buffer = new StringBuffer();
		for(int i=n ;i>0;i--) {
			buffer.append(i);
		}
		return buffer;
	}

}
