
public class PianoLog 
{
	public static void main(String[] args) 
	{
		java.util.Scanner scan = new java.util.Scanner (System.in);
		int t=scan.nextInt();
		while(t-- >0)
		{
			String s =scan.next();
			if(s.length()%2!=0)
			{
				System.out.println("no");
				continue;
			}
			boolean tampered=false;
			for(int i=0;i<s.length()-1;i+=2)
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					System.out.println("no");
					tampered=true;
					break;
				}
			}
			if(!tampered)
				System.out.println("yes");
		}
		
	}
	
}
