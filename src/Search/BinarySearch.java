package Search;

public class BinarySearch {

	public static void main(String[] args) {
		 int [] tmp = {1,8,15,24,33,45,76,88,99};
		 System.out.println(binarySerach(tmp, 99));
		 
		 
	}
	public static int binarySerach(int[] arr,int key){
		int low = 0;
		int high =arr.length-1;
		int time = 0;
		while(low <= high){
			time++;
			System.out.println("第"+time+"次");
			int mid = (int) ((low+high)/2);
			System.out.println("mid :"+mid);
			if(arr[mid] == key){
				return mid;
			}else if(arr[mid]<key){
				low = mid+1;
			}else{
				high = mid-1;
			}
		}
		return -1;
	}

}
