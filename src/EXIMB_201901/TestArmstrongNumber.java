package EXIMB_201901;
//第三題：
//請用 C#完成下列程式：阿姆斯壯數是一個很特別的數，在 n 位的整數中，若加總每個
//數字的 n 次方後等於該整數，該整數稱為阿姆斯壯數，例如 3 位數中(100-999) ，每一個數
//的 3 次方總和等於它本身時，則此數稱為阿姆斯壯數。例如 153 = 13 + 53 + 33=1+125+27，
//則 153 是一個阿姆斯壯數。請寫一個 C#程式找出 3 位數中的阿姆斯壯數。（注意：如果沒有
//任何計算直接列印出結果，將不給分）【20 分】
//程式的輸出為：
//153 是阿姆斯壯數
//370 是阿姆斯壯數
//371 是阿姆斯壯數
//407 是阿姆斯壯數
public class TestArmstrongNumber {
	public static void main(String []args){
		
		//two way to get num from char
		//1.use Character.getNumbericValue() method
		//2.(int) s -48 ,chr 48 is int 0
		
		testArmstrongNumber(153);
		testArmstrongNumber(370);
		testArmstrongNumber(371);
		testArmstrongNumber(407);
		testArmstrongNumber(123);
	}
	public static void testArmstrongNumber(Integer number){
		char [] strs = number.toString().toCharArray();
		int sum=0;
		for (char c : strs){
			int num = Character.getNumericValue(c);
			sum+= num*num*num;
		}
		if(number.equals(sum))
			System.out.println(number + " is a ArmstrongNumber" );
		else
			System.out.println(number + " is't a ArmstrongNumber");
	}
}
