package MEGABANK_201702;
//第一題：
//請使用JAVA 程式語言撰寫氣泡排序法實作。
//（一）請先用虛擬碼撰寫氣泡排序法。【5 分】
//  氣泡排序法採用相鄰兩兩比較大小若大的則交換，n個數字只要比較n-1次 總共n-1個回合
//  第一個迴圈執行n-1次代表n-1個round
//  第二個迴圈執行兩兩相鄰比較，每一round執行會則會在尾端產生1個排列完成的值，
//  故每一個回合兩兩相鄰比較的次數會根據第幾round減少相鄰比較次數
//
//（二）依據此虛擬碼，使用JAVA 程式語言撰寫氣泡排序法。【10 分】
//（三）請問 (7, 5, 8, 6) 此串列例子，若使用氣泡排序法，則會有幾回合(Pass)的疊代(iteration)？【5 分】
//	r1 -> 5 7 6 8
//  r2 -> 5 6 7 8
//  r3 -> 5 6 7 8
//  Ans: pass 1
public class TestBubbleSort {

	public static void main(String[] args) {
		int [] arr = {7,5,8,6};
		
		for(int i = 0 ; i<arr.length -1; i++) {
			for(int j = 0; j <arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}

		for(int i = 0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}

}
