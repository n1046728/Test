package MEGABANK_201802;

public class TestClass {
//	第一題：
//	何謂
//	Java 類別的多載 ( 、覆寫 ( 以及多型 Polymorphism) 試闡述其含意，並
//	以 Java 語法說明其使用情形。 【 25 分 】
	
//	Overloading 提供一樣的method名稱但不一樣的參數數目及型別，java會自動判別程式呼叫哪一個方法
//	例如物件的建構子依據不同的需求來使用建立物件屬性
//	Student()
//	Student(name)
//	Student(name , weight height)
//	
//	Overriding 繼承父類別後，重新改寫父類別方法
//	例如所有物件都父類別都為Object類別，但因不同的需求會改寫toString方法，使其在列印物件時產生各自需求的樣子
//	
//	Polymorphism 父類別參考指向子類別物件，並對應適當的方法
//	例如一間公司員工Employee但有很多不同的職位，例如董事長、總經理、....都繼承自Employee，但因各自職位不同可能需增加不同的方法及屬性，
//	但每一個物件都繼承父類別有一個方法付薪水的方法(paySalary())，因此在計算薪水時，每個職位的物件都被用父類別來參考如此可以方便運用計算整公司要付出的薪水
	
	
}
