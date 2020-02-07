package FCB_201902;

public class Choice28_EuclideanAlgorithm {
	//輾轉相除法
	//找尋最大因數(greatest common divisor，gcd）
	public static void main(String [] args) {
		Exmethod ex = new Exmethod();
		System.out.println(ex.test(38, 57));//19
	}
}

class Exmethod{
	public int test(int x,int y) {
		if(x<y)
			return test(y,x);
		int temp = x % y;
		
		if(temp == 0)
			return y;
		else
			return test(y,temp);
	}
}
