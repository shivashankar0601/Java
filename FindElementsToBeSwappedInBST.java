
public class FindElementsToBeSwappedInBST 
{
	public static boolean first=true;
	public static tnode a = null, b=null,prev=null;
	public static void main(String[] args) 
	{
		tnode root = new tnode(10);
		root.left = new tnode(17);
		root.left.left= new tnode(5);
		root.left.right= new tnode(9);
		root.right=new tnode(15);
		root.right.left = new tnode(13);
		root.right.right = new tnode(7);
		inorder(root);
		System.out.println();
		traverse(root);
	}
	
	public static void inorder ( tnode root )
	{
		if(root==null)
			return;
		else
		{
			inorder(root.left);
			if(prev!=null && prev.data > root.data )
			{
				if(first)
				{
					a=prev;
					first=false;
				}
				else
				{
					b=prev;
					swap();
				}
			}
			prev=root;
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
	public static void swap()
	{
		int temp = a.data;
		a.data=b.data;
		b.data=temp;
	}
	
	public static void traverse ( tnode root)
	{
		if(root==null)
			return;
		else
		{
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
	
}

class tnode{
	int data;
	tnode left=null;
	tnode right=null;
	tnode(int x)
	{
		data=x;
	}
}
