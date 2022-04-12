package Test;

public class TestInsertionSort {
	public static void main(String []args) {

		
		int []arr = {5,8,7,3,19,22};
		//insertionSort(arr);
		insertionSort2(arr);
		
		for(int num : arr) {
			System.out.print(num+" ");
		}

	}

	static void insertionSort(int arr[]) {
		
		for(int i = 1 ;i<arr.length ;i++) {
		
			int j = i-1;
			
			while(j>=0) {
				System.out.println(arr[j]+ " " + arr[j+1]);
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
				j--;
			}
			
		}
	}
	
	static void insertionSort2(int arr[]) {
		
		for(int i = 1 ;i<arr.length ;i++) {
		
			int j = i-1;
			int item = arr[i];
			while(j>=0 && item < arr[j]) {

				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
			
		}
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
