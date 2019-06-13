import java.util.Arrays;

public class sort012s 
{
	public static void main(String[] args) 
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		
		int t[] = {0,0,0};	// for count sort
		
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			t[a[i]]++;
		}
// count sort technique
		int i=0;
		for(;i<t[0];i++)
			a[i]=0;
		
		for(;i<t[1]+t[0];i++)
			a[i]=1;
		
		for(;i<t[1]+t[0]+t[2];i++)
			a[i]=2;
// count sort ends here
		
//		Arrays.parallelSort(a);	// normal sorting technique
		
		for(int x : a)
			System.out.print(x+" ");
	}
	
	
}
