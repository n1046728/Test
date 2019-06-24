package TCB_201902;

public class TestBinarySearchTree {
	public static void main(String[]args){
		int [] inputs = {60,55,15,57,100,67,107};
		TreeNode<Integer> tree=null;
		for(int in :inputs){
			insert(tree,in);
		}
		System.out.println(tree);
		System.out.println("solution:"+search(tree,60));
		TreeNode<Integer> tree2=null;
		test(tree2);
		System.out.println("tree2 : "+tree2);
	}
	public static TreeNode<Integer> createTree(int [] inputs){
		TreeNode<Integer> tree = new TreeNode(inputs[0]); 
		for(int i =1 ;i<inputs.length;i++){
			insert(tree,inputs[i]);
		}
		
		return tree;
	}
	public static boolean search(TreeNode<Integer>root,Integer element){
		if(root == null)
			return false;
		if(root.getElement() == element)
			return true;
		
		return root.getElement()>element ? search(root.getRight(),element)
										 : search(root.getLeft(),element);
	}
	public static void insert(TreeNode<Integer> root,Integer element){
		if(root == null){
			root = new TreeNode<Integer>(element);
			System.out.println("root:"+root);
			return;
		}
		System.out.println("second");
		if(root.getElement() > element){
			if(root.getRight() == null)
				root.setRight(new TreeNode(element));
			else
			 insert(root.getRight(),element);
		}else{
			if(root.getLeft() == null)
				root.setLeft(new TreeNode(element));
			else
			 insert(root.getLeft(),element);
		}
	}
	public static void test(TreeNode<Integer> root){
		root = new TreeNode<Integer>(5);
		System.out.println("root :　"+root);
	}
}


class TreeNode<E>{
	protected E element;
	protected TreeNode<E> left;
	protected TreeNode<E> right;
	public TreeNode(E e){
		element = e;
	}
	public E getElement(){
		return element;
	}
	public void setElement(E element){
		this.element = element;
	}
	public TreeNode<E> getLeft(){
		return left;
	}
	public void setLeft(TreeNode<E> left){
		this.left = left;
	}
	public void setRight(TreeNode<E> right){
		this.right = right;
	}
	public TreeNode<E> getRight(){
		return right;
	}
	
}