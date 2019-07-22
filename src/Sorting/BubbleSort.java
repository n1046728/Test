package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {3,7,1,6,8};
		for(int i = 0 ;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++){
			System.out.printf("%d ", arr[i]);
		}
	}

}
