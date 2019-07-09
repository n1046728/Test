package TAIFEX_201001;
//
//題目六 	
//Please find the relation of the following numbers and program the relation with C++.
//(Please use recursive program) 10
//2, 2, 4, 6, 10, 16, 26, …
public class TestRecursive {
	public static void main(String [] args) {
		System.out.println(fibonacci(4));
	} 
	public static int fibonacci(int num) {
		if(num==0 || num == 1) {
			return 2;
		}
		
		return fibonacci(num-1)+fibonacci(num-2);
	} 
}
