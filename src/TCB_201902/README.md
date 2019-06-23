第一題：
利用建構子(constructor)的觀念並依下面提供之程式架構撰寫 JAVA 程式，使 main()內
的功能可以順利執行，但撰寫程式時必需符合下列 6 項規範：【25 分】
1.main()內的內容皆不可更動或增加。
2.class Base 內的 private int a;與 private int m=2;，其需宣告之 private 屬性不可更改，必須完全相同。
3.class Derive 必需繼承類別 class Base。
4.利用 Derive x=new Derive (4,5); 建立 x 物件，並同時將 4 與 5 分別設定給 class Base內的 a 與 class Derive 內的 b。
5.public void show()為能將 a、m 與 b 相乘後之結果從螢幕列印出。
6.（自行設計之部分）你可自由撰寫所需求的部分，使得整個程式能順利的執行。提供之程式架構如下：
class Base {
private int a;
private int m=2;
（自行設計之部分）
}
class Derive 繼承 Base {
int b;
（自行設計之部分）
public void show() {
 （自行設計之區塊）
}
}
public class P1 {
public static void main(String[] args) {
 Derive x=new Derive (4,5);
 x.show();
}
}
