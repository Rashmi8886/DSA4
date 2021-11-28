import java.util.*;
class ListNode{
	int data;
	ListNode left,right;
	ListNode(int data)
	{
		this.data=data;
	}
}

public class Binary {
   
     ListNode root;
     Binary()
     {
    	 root=null;
     }
    public static int count=0;
    public static int sum=0;
	
	public void inorder(ListNode node)
	{
		if (null==node)
		{
			return;
		}
		count++;
		inorder(node.left);
		System.out.print(node.data+" ");
		sum=sum+node.data;
		inorder(node.right);
	}
	public void preorder(ListNode node)
	{
		if (null==node)
		{
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
		
	}
	public void postorder(ListNode node)
	{
		if (null==node)
		{
			return;
		}
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
		
	}
	
	public void inorder() {
		inorder(root);
		
		
	}
		public void postorder() {
			postorder(root);
		}
		public void preorder() {
			preorder(root);
		}
	public int getHeight(ListNode node)
	{
		if(null==node)
			return -1;
		int leftDepth=getHeight(node.left);
		int rightDepth=getHeight(node.left);
		if(leftDepth>rightDepth)
			return leftDepth+1;
		else
			return rightDepth+1;
		
	}
   public static ListNode parentNode=null;
	public void leafNode(ListNode node)
	
	{   
		
		
		if(null==node)
		{
			
			return;
		}
		if(node.left==null&& node.right==null)
			System.out.print(node.data+" ");
		
		leafNode(node.left);
		leafNode(node.right);
	}
 
 public static void main(String[] args)
 {
	 Binary obj=new Binary();
	 obj.root=new ListNode(1);
	 obj.root.left=new ListNode(3);
	 obj.root.right=new ListNode(4);
	 obj.root.left.left=new ListNode(5);
	 obj.root.left.right=new ListNode(6);
	 obj.inorder();
	 System.out.println();
	 obj.preorder();
	 System.out.println();
	 obj.postorder();
	 System.out.println();
	 System.out.println(obj.getHeight(obj.root));
	 System.out.println("no. of nodes "+Binary.count);
	 System.out.println("sum of nodes "+Binary.sum);
	 
	 obj.leafNode(obj.root);
 }
}