
public class TestBinarySearchTree {
//二元搜尋樹(Binary Search Tree)是指一棵二元樹狀資料結構，具有下列性質：
//1. 若任意節點的左子樹不空，則左子樹上所有節點的值均小於它的根節點的值；
//2. 若任意節點的右子樹不空，則右子樹上所有節點的值均大於它的根節點的值；
//3. 任意節點的左、右子樹也分別為二元搜尋樹；
//4. 沒有鍵值相等的節點。
//上圖為一二元搜尋樹範例，請就上圖回答下列問題：
//（一）上面二元搜尋樹範例若加入一值為 44 的節點則該樹會變如何？請繪出結果。【5 分】
//（二）上面二元搜尋樹範例若刪去值為 100 的節點則該樹會變如何？請繪出結果。【5 分】
//（三）請列出第（二）小題二元搜尋樹範例中序走訪(inorder traversal)結果。【5 分】
//（四）假設同一組節點資料，插入二元搜尋樹的順序不同，會有何不同？中序走訪結果
//會相同嗎？為什麼？【5 分】
//（五）下面 Java 程式碼為節點類別宣告，請寫出搜尋方法的演算法。【5 分】
//	class TreeNode<E> {
//			protected E element ;
//			protected TreeNode<E> left ;
//			protected TreeNode<E> right ;
//			public TreeNode(E e) {
//			element = e ;
//		}
//	}
//	boolean search(TreeNode root, E element)若 E 存在則回傳 true,否則回傳 false.
	
	public static void main(String args[]) {
		int [] inputs = {60,55,45,57,100,67,107};
		TreeNode<Integer> tree = create(inputs);	
		System.out.println("tree:"+tree);
		Integer a = 101;
		System.out.println("Is a = "+a+" in tree? ans: "+search(tree, a));
		
	}
	public static void insert(TreeNode<Integer> root ,Integer in) {
		if(root.getElement() < in ) {
			if(root.getRight()==null) {
				root.setRight(new TreeNode<>(in));
			}else {
				insert(root.getRight(),in);
			}
		}else {
			if(root.getLeft()==null) {
				root.setLeft(new TreeNode<>(in));
			}else {
				insert(root.getLeft(),in);
			}
		}
	}
	public static TreeNode<Integer> create(int[] inputs){
		TreeNode<Integer> root = new TreeNode<>(inputs[0]);
		for(int i=1 ;i<inputs.length;i++) {
			insert(root,inputs[i]);
		}
		
		return root;
	}
	public static boolean search(TreeNode<Integer> tree ,Integer element) {
		//System.out.println("tree ele :"+tree.getElement() + " ele :"+element); //check point
		if(tree == null)
			return false;
		if(tree.getElement() == element)
			return true;
		else if(tree.getElement()>element)
			return search(tree.getLeft(),element);
		else
			return search(tree.getRight(),element);
	}
}
class TreeNode<E>{
	protected E element;
	protected TreeNode<E> left;
	protected TreeNode<E> right;
	
	public TreeNode() {};
	
	public TreeNode(E element){
		this.element = element;
	}
	
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public TreeNode<E> getLeft() {
		return left;
	}
	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}
	public TreeNode<E> getRight() {
		return right;
	}
	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
	
}
