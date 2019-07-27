package Sorting;

public class MergeSort {
	public static void main(String [] args){
		int [] arr ={8,1,5,7,4,3,6,2};
		mergeSort(arr,0,arr.length-1);
		
		for(int i = 0;i<arr.length;i++)
			System.out.printf("%d ",arr[i]);
	}
	public static void mergeSort(int[] arr,int start ,int end){
		if(start < end){
			int mid = (start+end)/2;
			//System.out.println("A:s:"+start+"m:"+mid+"end:"+end);
			mergeSort(arr,start,mid);
			//System.out.println("B:s:"+start+"m:"+mid+"end:"+end);
			mergeSort(arr,mid+1,end);
			//System.out.println("C:s:"+start+"m:"+mid+"end:"+end);
			merge(arr,start,mid,end);
		}
	}
	public static void merge(int[] arr,int start,int mid,int end){
		int [] lowHalf = new int[mid - start +1];
		int [] highHalf = new int[end - mid];
		int i;
		int j;
		int k = start;
		
		for(i = 0 ; k <=mid;i++,k++)
			lowHalf[i] = arr[k];
			
		for(j=0 ; k<=end;j++,k++)
			highHalf[j] = arr[k];
				
		k=start;
		i=0;
		j=0;
		
		while(i<lowHalf.length && j< highHalf.length){
			if(lowHalf[i]<highHalf[j]){
				arr[k] = lowHalf[i];
				i++;
			}else{
				arr[k] = highHalf[j];
				j++;
			}
			k++;
		}
		while(i<lowHalf.length){
			arr[k] = lowHalf[i];
			i++;
			k++;
		}
		while(j<highHalf.length){
			arr[k] = highHalf[j];
			j++;
			k++;
		}
	}
}
