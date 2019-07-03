package TAIFEX_201401;
//題目一：
//現有貨品編號與名稱如下：
//1248-Chair
//1553-Lego
//1685-Cake
//請根據以下限制條件，以 C#程式語言將以上規格撰寫類別鍵入 List 物件，再以 foreach
//輸出成上述格式內容。【25 分】
//1. List 需採 strict 模式
//2.將類別命名為 Part
//3.物件需有建構式，以建構式鍵入 List
//4.輸出時需採 String.Format 處理

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String []args){
		List<Part> list = new ArrayList<>();
		list.add(new Part("1248","Chair"));
		list.add(new Part("1553","Lego"));
		list.add(new Part("1685","Cake"));
		list.forEach(s->{
			System.out.printf("%s-%s%n",s.getId(),s.getName());
			//System.out.println(String.format("%s-%s", s.getId(),s.getName()));
		});
	}
}
class Part{
	private String id;
	private String name;
	public Part(String id , String name){
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}