class node
{
	int data;
	node next=null;
}


public class LinkedListMergeSort 
{

	public static void main(String[] args) 
	{
		node temp;
		node head = new node();
		head.data=20;
		head.next=temp= new node();
		temp.data=40;
		temp.next=new node();
		temp=temp.next;
		temp.data=10;
		temp.next=new node();
		temp=temp.next;
		temp.data=30;
		temp.next=null;
		temp=head;
		
		temp=MSort(head);
		/*
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		*/
	}

	public static void printData( node p)
	{
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	
	
	private static node MSort(node head) 
	{
		if(head!=null)
		{
			printData(head);
			node mid = findMiddleNode(head);
			System.out.println("-------"+mid.data);
			node temp = mid;
			temp.next=null;
			mid=mid.next;
			MSort(head);
			MSort(mid);
		//head=Merg(head,mid);
			return null;
		}
		else
		{
			return head;
		}
	}

	private static node Merg(node head, node mid) 
	{
		
		return null;
	}

	private static node findMiddleNode(node head)
	{
		if(head!=null && head.next!=null)
		{
			node fast=head.next,slow=head;
			while(fast !=null && fast.next!=null)
			{
				//System.out.print(slow.data+" ");
				fast=fast.next.next;
				slow=slow.next;
			}
			return slow;
		}
		else
			return head;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
