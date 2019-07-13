package Other;

public class TestNineGridNum {
//	有一個九宮格，要把1到9的數字填進去，不可以重複， 
//	結果要讓九宮格不論直的、橫的、斜的數字相加都會是一樣的數!!
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8;
		int k =0;
		do {
			for(int i = 0 ; i<arr.length;i++) {
				int ran = (int) (Math.random()*9);
				if(i != ran) {
					int tmp = arr[i];
					arr[i] = arr[ran];
					arr[ran] = tmp; 
				}
			}
			sum1 = arr[0]+arr[1]+arr[2];
			sum2 = arr[3]+arr[4]+arr[5];
			sum3 = arr[6]+arr[7]+arr[8];
			
			sum4 = arr[2]+arr[4]+arr[6];
			sum5 = arr[0]+arr[4]+arr[8];
			
			sum6 = arr[0]+arr[3]+arr[6];
			sum7 = arr[1]+arr[4]+arr[7];
			sum8 = arr[2]+arr[5]+arr[8];
			System.out.println(++k);
		}while(!(sum1 == sum2 && sum1 == sum3 && sum1 == sum4&& sum1 == sum5&& sum1 == sum6&& sum1 == sum7 && sum1 == sum8));
		
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
			if(i==2 ||i==5||i==8)
				System.out.println();
		}
		System.out.printf("%d,%d,%d,%d,%d,%d,%d,%d",sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8);
	}

}
