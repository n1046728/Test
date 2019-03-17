
public class TestSort {
	public static void main(String [] args) {
		// 實作排序演算法，將輸入的陣列由大到小排列並輸出

		int [] array = {9,7,3,5,4,10,6,2,1};
		sort(array);
		for(int i = 0 ; i<array.length ; i++) {
			System.out.println(array[i]);
		}
	}
	public static int[] sort(int [] array) {
		int len = array.length;
		for(int i = 0 ;i<len ;i++) {
			for(int j = i+1 ;j < len;j++) {
				if(array[i]<array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

}
