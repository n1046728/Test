package Sorting;

public class QuickSort {
	//先找一個中值，把小於中間值的資料放在左邊，大於的放在右邊
	public static void main(String[] args) {
		int [] arr = {7,3,5,8,6,1};
		quickSort(arr,0,arr.length-1);
		
		

	}
	public static void quickSort(int []arr ,int startIndex ,int endIndex){
		int pivotIndex = startIndex;
		for(int i = startIndex+1 ; i<endIndex ; i++){
			if(arr[i]<arr[pivotIndex]){
				int tmp = arr[pivotIndex];
				arr[pivotIndex] = arr[i];
				arr[i] = tmp;
				pivotIndex=i;
			}
		}
		for(int i = 0 ; i<arr.length ; i++)
			System.out.printf("%d " ,arr[i]);
	}

}
