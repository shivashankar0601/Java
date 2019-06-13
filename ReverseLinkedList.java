
public class ReverseLinkedList 
{
	public static void main ( String ... args)
	{
		node head = new node();
		head.data=1;
		head.next=new node();
		head.next.data=3;
		head.next.next=new node();
		head.next.next.data=9;
		head.next.next.next=new node();
		head.next.next.next.data=2;
		head.next.next.next.next=new node();
		head.next.next.next.next.data=6;
		head=reverse(head,4);
		node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		
	}
	
	public static node reverse(node head, int k)
	{
		
		node current = head,prev=null,next=null;
		
		int count=0;
		
		while(count<k && current !=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;			
			count++;
		}
		
		if(next!=null)
			head.next=reverse(next,k);
		
		
		return prev;
	}
	
	
	
	
	
}
