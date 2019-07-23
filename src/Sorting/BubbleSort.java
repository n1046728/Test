package Sorting;

import java.util.Arrays;

public class BubbleSort {
	/* BubbleSort
	 * n個數字，兩兩比較，每一round產生一個值，總共n-1的 round
	 * ex. 4 3 2 1
	 * 	r1 3 2 1 4
	 *  r2 2 1 3 4
	 *  r3 1 2 3 4
	 *  
	 * 時間複雜度 n^2
	 */
	public static void main(String[] args) {
		int [] sortArr = getRandomArr(10);
		showArr(sortArr);
		
		//Acending
//		for(int i = sortArr.length-1 ; i>=1;i--){
//			for(int j = 0;j<i-1;j++){
//				if(sortArr[j]>sortArr[j+1]){
//					int tmp = sortArr[j];
//					sortArr[j] = sortArr[j+1];
//					sortArr[j+1] = tmp;
//				}
//			}
//		}
		//decending
		for(int i = 0 ;i<sortArr.length;i++){
			for(int j=0;j<sortArr.length-i-1;j++){
				if(sortArr[j]<sortArr[j+1]){
					int tmp = sortArr[j];
					sortArr[j] = sortArr[j+1];
					sortArr[j+1] = tmp;
				}
			}
		}
		showArr(sortArr);
	}

	public static int[] getRandomArr(int n){
		int [] rtnArr = new int[n];
		for(int i = 0 ; i<rtnArr.length;i++){
			rtnArr[i] = (int)(Math.random()*100);
		}
		return rtnArr;
	}
	public static void showArr(int [] arr){
		StringBuffer buffer = new StringBuffer(0);
		for(int i = 0 ;i<arr.length;i++)
			buffer.append(arr[i]+" ");
		System.out.println(buffer);
	}
	
}
