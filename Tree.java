
public class Tree {
	
	public Tree left=null;
	public Tree right=null;
	public int value;
	public Tree(int value)
	{
		this.value=value;
	}
	public Tree(Tree left,Tree right,int value)
	{
		left=this.left;
		right=this.right;
		value=this.value;	
	}
		
	public void displayRoot()
	{
		System.out.println("value is : "+value);
	}
	public Boolean isleaf()
	{
		if(this.left==null && this.right==null)
			return true;
		else
			return false;
	}
	public void preorder(Tree ro)
	{
		System.out.println("value of the node is : "+ro.value);
		if(ro.isleaf())
		{
			return;
		}
		preorder(ro.left);
		preorder(ro.right);
	}
	public void inorder(Tree ro)
	{
		
		if(ro.isleaf())
		{
			return;
		}
		preorder(ro.left);
		System.out.println("value of the node is : "+ro.value);
		preorder(ro.right);
	}

	public static void main (String[] args)throws Exception {
		Tree root =new Tree(1);
		//System.out.println(root.value);
		//root.isleaf();
		Tree l1=new Tree(2);
		Tree r1=new Tree(3);
		Tree l2=new Tree(4);
		Tree r2=new Tree(5);
		root.left=l1;
		root.right=r1;
		l1.left=l2;
		l1.right=r2;
		System.out.println("pre order traversal");
		root.preorder(root);
		System.out.println("in order traversal");
		root.inorder(root);
//		System.out.println(root.left.value);
	}
}



