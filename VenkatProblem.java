
public class VenkatProblem 
{
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner (System.in);
		int t = scan.nextInt();
		while(t-- > 0)
		{
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i]=scan.nextInt();
			
			for(int i=0;i<n;i++)
			{
				if(a[i]!=i+1)
				{
					System.out.println(i+1 +" is the missing number");
					break;
				}
			}		
			
			int rep=Integer.MAX_VALUE;
			for(int i=0;i<n-1;i++)
			{
				if(a[i]==a[i+1] && rep >a[i])
					rep=a[i];		
				
			}
			
			System.out.println(rep+" is the repeated yet least value in the data");
			
			
		}
	}
	
}
