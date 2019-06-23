package TDCC_20190317;

public class TestBasic {
	public static void main(String args[]) {
		int[] a = new int[10];
		System.out.println(a[9]); //print 0 --> mean default =0
		
		int b = 0; //print 0 1
		System.out.println(b++);
		System.out.println(b);
		
		int c = 2; //print BC
		switch(c) {
			case 1:
				System.out.println("A");
			case 2:
				System.out.println("B");
			case 3:
				System.out.println("C");
				break;
			default:
				System.out.println("default");
		}
	}
}
