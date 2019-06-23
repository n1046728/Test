package TCB_201902;

public class TestConstructor {
	public static void main(String arg[]){
		Derive x = new Derive(4, 5);
		x.show();
		//重點在於考建構子如何傳遞參數給父類別，呼叫父類別方法super.setA();
	}
}
