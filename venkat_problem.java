import java.util.Scanner;

public class venkat_problem 
{
	public static void main ( String ... args)
	{
		java.util.Scanner input = new java.util.Scanner (System.in);
		int test_case_count = input.nextInt();
		for(int i=0;i<test_case_count;i++)
		{
			long l = input.nextLong();
			
			long ans =0;
			while(l>0)
			{
				ans =(10*ans)+(l%10);
				l/=10;
			}
			ans=Long.parseLong(ans+"");
			System.out.println(ans);
			
		}
	}
	
}
