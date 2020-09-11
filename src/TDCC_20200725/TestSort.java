package TDCC_20200725;

public class TestSort {
	public static void main (String [] args){
		//請將account與對應的money依照大到小的方式，印出來
    String [] account = {"A","B","C","D","E"};
		int[] money = {3000,2000,1500,4000,600};
		
		//bubble sorting
		for(int i = money.length-1;i>0;i--){
			for(int j = 0 ;j<i;j++){
				if(money[j]<money[j+1]){//1.小於：descending order 2.大於：ascending order
					swapA(account, j, j+1);
					swapB(money, j, j+1);
				}
			}
		}
		
		for(int i = 0;i<money.length;i++){
			System.out.println("account:"+account[i]+" money:"+money[i]);
		}
	}
	public static void swapA(String [] arr ,int n1,int n2){
		String temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;
	}
	public static void swapB(int [] arr ,int n1,int n2){
		int temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;
	}
}
