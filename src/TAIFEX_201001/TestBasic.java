package TAIFEX_201001;
//第七題
//Please answer the following questions:
//a. What are three major features about object oriented programming? 3
//Ans:
//(1)Encapsulation
//   根據類別的特性分成private、default、protected、public等四個封裝等級，亦即存取類別成員的權限限制
//(2)Inheritance
//	 建立新類別時，修改、添加或繼承現有類別的定義
//(3)Polymorphism
//	 父類別的參考指向子類別物件，並對應稻子類別中適當的方法

//b. What is the enterprise which develops the JAVA program? 3
//Ans:Java EE

//c. What should be noticed when inheriting from the base class? 4 
//Ans:Java不支援多重繼承		
//		
//第五題
//Please answer the following questions about JAVA programming language:
//a. What does execute the JAVA byte codes? What are the advantages and disadvantages with
//such mechanism? 8
//Ans:java 為靜態語言，java的執行可分為編譯時期、載入時期、執行時期，其中編譯時期產生出來的即為java byte code
//	  優點：跨平台、避免執行時期的簡單錯誤，缺點：程式繁瑣、彈性不足，只能檢查出執行時期的簡單錯誤
//
//b. The following is a JAVA error message. What’s happen and how to solve it? 7
//HelloWorld.java:107: reference to Date is ambiguous, both class java.sql.Date in java.sql and
//class java.util.Date in java.util match
//Ans:因為Date 同時為兩個package都有，系統無法判別使用的對象為何，建立時可以使用Fully qualified name來建立，避免此錯誤訊息發生
//	  例如：java.util.Date date1 = new java.util.Date();
//

public class TestBasic {

}


