// Histogram Area Calculating Program
public class LRA // Largest Rectangular Area
{
	public static int a[]=null;
	public static void main(String[] args) 	
	{
		System.out.println();
		java.util.Scanner scan = new java.util.Scanner (System.in);
		int n = scan.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}		
		System.out.println(findLRA());		
	}
	
	// simplified version
	public static int findLRA()
	{
		int sum=0,k=0;		
		int c[] = new int[a.length];				
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
				continue;
			else
				k=a[i];
			int count=0;
			int m=0;
			// make the continious checking array values 0 and assign the continious values as 1 if exists and count consequent no of 1's
			for(int j=0;j<c.length;j++)
			{
				c[j]=0;
				if(a[j]>=k)
				{
					c[j]=1;
					m++;					
				}
				else
				{
					if(m>count)
						count=m;
					m=0;
				}
			}
			if(m>count)
				count=m;			
			
			if(sum< (count*k))
				sum=count*k;
		}
		return sum;
	}
}	
	
	/*
	
public static int findLRA()
	{
		int sum=0,k=0;
		int b[] = new int[a.length];
		int c[] = new int[a.length];
		for(int i=0;i<a.length;i++)
			b[i]=a[i];
		java.util.Arrays.sort(b);
		
		for(int i=0;k<b.length;k++)
		{
			if(i!=b[k])
				i=b[k];
			else
				continue;
			int count=0;
			int m=0;
			// make the continious checking array values 0 and assign the continious values as 1 if exists and count consequent no of 1's
			for(int j=0;j<c.length;j++)
			{
				c[j]=0;
				if(a[j]>=i)
				{
					c[j]=1;
					m++;					
				}
				else
				{
					if(m>count)
						count=m;
					m=0;
				}
			}
			if(m>count)
				count=m;			
			
			if(sum< (count*i))
				sum=count*i;	
			
		}
		return sum;
	}
	
	
	
	*/
