package Sorting;

public class InsertionSort {
	//每一次往後取一筆資料，插入到前面已排的好資料當中
	public static void main(String[] args) {
		//int[] arr = {7,5,9,8,4,3};
		int [] arr = getRandomArr(10);
		for(int i = 1 ;i<arr.length;i++){
			int tmp = arr[i];
			int j= i-1;
			while(tmp < arr[j]){
				arr[j+1] = arr[j];
				j--;
				if(j==-1)
					break;
			}
			arr[j+1] = tmp;
		}
		for(int i =0 ;i<arr.length;i++){
			System.out.printf("%d ",arr[i]);
		}
	}
	public static int[] getRandomArr(int n){
		int [] rtnArr = new int[n];
		for(int i = 0 ; i<rtnArr.length;i++){
			rtnArr[i] = (int)(Math.random()*100);
		}
		return rtnArr;
	}

}
