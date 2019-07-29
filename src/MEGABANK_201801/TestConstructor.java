package MEGABANK_201801;

public class TestConstructor {
//	第一 題：
//	請回答下
//	列有關 JAVA 程式在類別的建構式 (Constr u ctor) 方法應用：
//	（一）何謂建構式和預設建構式？ 請簡述之。 【 10 分】
//	（二 )請 寫 出 以下描述的 JAVA 程式：在 Customer 類別內定義三個建構式 分別有 Customer () 建構式、
//	Customer (weight) 建構式、 Customer (height, weight) 建構式等，其一開始初始化 height 資料成員
//	的值為 150 和 weight 資料成員的值為 40 ，利用建構式多載傳入不同數目的引數，分別來初始
//	化 height 和 weight 資料成員，並印出以下輸出畫 面結果。【 15 分】
//
//	Peter 使用Customer()建構，h:150,w:40
//  David 使用Customer(290)建構，h:150,w:40
//	Mary  使用Customer(170,68)建構，h:170,w:68
	public static void main(String[] args) {
		System.out.print("Peter的資料是-->");
		Customer peter = new Customer();
		System.out.println(peter);
		
		System.out.print("David的資料是-->");
		Customer David = new Customer(290);
		System.out.println(David);
		
		System.out.print("Mary的資料是-->");
		Customer Mary = new Customer(170,68);
		System.out.println(Mary);
		
	}
}
class Customer{
	private double height = 150;
	private double weight = 40;
	public Customer() {
		System.out.println("使用Customer()建構式");
	}
	public Customer(double weight) {
		System.out.println("使用Customer("+weight+")建構式");
		setWeight(weight);
	}
	public Customer(double height,double weight) {
		System.out.println("使用Customer("+height+","+weight+")");
		setWeight(weight);
		setHeight(height);
	}
	public void setWeight(double weight) {
		if(weight >0 && weight <200) {
			this.weight = weight;
		}
	}
	public void setHeight(double height) {
		if(height >0 && height<250 ) {
			this.height = height;
		}
	}
	@Override
	public String toString() {
		return "身高是：" + height + "\n體重："+ weight;
	}
	
}
