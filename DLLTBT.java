public class DLLTBT 
{	
	public static void main(String[] args) 
	{
		
		// creating the nodes of the doubly linked list
		box head = new box(1);
		box temp=head;
		head.left=null;
		head.right = new box(2);
		head.right.left = head;
		head=head.right;
		head.right = new box(3);
		head.right.left = head;
		head=head.right;
		head.right = new box(4);
		head.right.left = head;
		head=head.right;
		head.right = new box(5);
		head.right.left = head;
		head=head.right;
		head.right = new box(6);
		head.right.left = head;
		head.right.right=null;

		//printDLL(temp);// printing doubly linked list first to check if everything is ok or not
		
		head=DLL2BT(temp); // converting the doubly linked list to binary tree and getting the root reference
		
		traverseTree(head); // traverse the binary tree using the root
		
	}
	
	public static box DLL2BT(box head)
	{		
		if(head!=null)
		{
			box node=null;
			try 
			{
				node = findMid(head);
				node.left.right=null;
				node.left=DLL2BT(head);
				node.right.left=null;
				node.right=DLL2BT(node.right);
			}
			catch( Exception e){ }
			return node;
		}
		return null;
	}
	
	public static void traverseTree(box root)
	{
		if(root!=null)
		{
			traverseTree(root.left);
			System.out.print(root.data+" ");
			traverseTree(root.right);
		}		
	}
	
	public static box findMid(box head)
	{
		box slow=head,fast=head.right;
		try
		{
			while(fast!=null)
			{
				slow=slow.right;
				fast=fast.right.right;
			}
		}
		catch(Exception e){	}
		return slow;
	}
	
	public static void printDLL(box head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.right;
		}
	}	
}

class box
{
	int data;
	box left=null,right=null;
	box(int a)
	{
		data=a;
	}
}