import java.util.HashMap;

public class TestClass 
{
	public static void main (String ... args)
	{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int n = scan.nextInt();
		HashMap <String,Integer>hm = new HashMap<String,Integer>();
		String start=null;
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				start=scan.next();
				hm.put(start, 0);
			}
			else
				hm.put(scan.next(), i);
		}
/*
	    for(Entry<String, Integer> es : hm.entrySet())
	    {
	    	System.out.println(es.getKey()+" "+es.getValue());
	    }
//	    System.out.println(start);
*/
		
		int a[][]= new int[n][n];
	    for(int i=0;i<n;i++)
	        for(int j=0;j<n;j++)
	            a[i][j]=scan.nextInt();
	    
	    
	    int t=scan.nextInt();
	    
	     
	    int cost=0;
	    for(int i = 0;i<t;i++)
	    {
	    	String dest = scan.next();
	        int temp=a[hm.get(start)][hm.get(dest)];
	        //System.out.println(temp+" "+cost);
	        cost+=temp;
	        start=dest;
	    }
	    System.out.println(cost);

		
	}
	
	
}
