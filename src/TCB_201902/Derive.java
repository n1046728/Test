package TCB_201902;

public class Derive extends Base{
	private int b;
	public Derive(int a ,int b){
		this.b = b;
		super.setA(a);
	}
	
	public void show(){
		System.out.println("axb = "+ super.getA()*b);
		System.out.println("mxb = "+ super.getM()*b);
	}
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
}
