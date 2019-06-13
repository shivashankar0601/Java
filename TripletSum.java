import java.util.*;
public class TripletSum
{
	public static void main(String[] args) 
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int s= scan.nextInt();
		Arrays.parallelSort(a);
		int c=0;
		for(int i=0;i<n;i++)
		{
			int l=i+1,r=n-1;
			while(l<r)
			{
				if(a[i]+a[l]+a[r]==s)
				{
					System.out.println("Triplet found "+a[i]+" "+a[l]+" "+a[r]+" ");
					c++;
					l++;
				}
				else if(a[i]+a[l]+a[r]<s)
				{
					l++;
				}
				else if(a[i]+a[l]+a[r]>s)
				{
					r--;
				}
			}
		}
		
		System.out.println("no of triplets found in this scenario : "+c);
	}

}
