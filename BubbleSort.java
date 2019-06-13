

//finding the k largest elements with bubble sort with n*k complexity
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		int k = scan.nextInt();
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}	
		
		// printing in descending order
		for(int i=n-1;i>n-k-1;i--)
			System.out.print(a[i]+" ");
		System.out.println();
		
		
		// printing in ascending order that
		for(int i=n-k;i<n;i++)
			System.out.print(a[i]+" ");
		
		
		
	}
	
}
