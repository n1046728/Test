package Sorting;

public class SelectionSort {
	/*	SelectionSort
	 *  找比目前大或小的數字時，先記錄其位置，確定後進行交換
	 * 	時間複雜度 n^2
	 */
	public static void main(String[] args) {
		int [] arr = getRandomArr(10);
		//Acending 此處是令Min 為arr[i]
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
