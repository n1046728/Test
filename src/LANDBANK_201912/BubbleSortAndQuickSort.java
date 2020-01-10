package LANDBANK_201912;

//請使用 C#或 C++或 JAVA 任何一種程式語言，並使用氣泡排序法(Bubble Sort)或快速
//排序法(Quick Sort)，將數字陣列{48, 56, 18, 96, 26, 35}由小到大排序後輸出結果。
public class BubbleSortAndQuickSort {
	public static void main(String [] args) {
		int [] arr = {48,56,18,96,26,35};
		bubbleSortDesc(arr);
	}
	
	public static void bubbleSortAsc(int [] arr) {
		for(int i = 0 ;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int num:arr) {
			System.out.println(num);
		}
	}
	public static void bubbleSortDesc(int [] arr) {
		for(int i = 0 ;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int num:arr) {
			System.out.println(num);
		}
	}
	public static void quickSort(int [] arr) {
		
	}
}
