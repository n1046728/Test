package Sorting;

public class QuickSort {
	//先找一個中值，把小於中間值的資料放在左邊，大於的放在右邊
	//注意partition撰寫方式
	//
	public static void main(String[] args) {
		int [] arr = {7,3,5,8,6,1};
		quickSort(arr,0,arr.length-1);
		
		for(int i = 0 ; i<arr.length ; i++)
			System.out.printf("%d " ,arr[i]);

	}
	public static void quickSort(int []arr ,int start ,int end){
		if(start<end) {
			int pivot = partition(arr,start,end);
			quickSort(arr,start,pivot-1);
			quickSort(arr,pivot+1,end);
		}
	}
	public static int partition(int [] arr , int start,int end) {
		int pivot = arr[end];
		int i =start-1;
		for(int j = start;j<end;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr , i,j);
			}
		}
		i++;
		swap(arr,i,end);
		return i;
	}
	public static void swap(int [] arr, int a ,int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

}
