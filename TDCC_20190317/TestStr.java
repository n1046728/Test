
public class TestStr {

	public static void main(String[] args) {
		/* 輸入一個數字計算總和，給定function int add(int v)，並利用遞迴的方式
		 * 例如825-->8+2++5 = 15
		 */
		
		int input = 825;		
		System.out.println("input :"+ input + "  sum :　" + add(input));
		
	}
	public static  int add(int v ) {
		String str = new Integer(v).toString();
		
		if(str.length() == 1) {
			return v;
		}
		
		int first = Integer.parseInt(str.substring(0,1));
		//System.out.println("first :"+first);
		int left = Integer.parseInt(str.substring(1, str.length()));
		//System.out.println("left : "+left);
		return first + add(left);
		
	}

}
