import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DaterRNoDate 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(scan.readLine());
		//String s[] = new String[n];
		HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>(); 
		boolean boy=true;
		for(int i=0;i<n;i++)
		{
			//System.out.println(scan.nextLine());
			//System.out.println("loop");
			String s=scan.readLine();
			//System.out.println(s);
			String a[]= s.split(" ");
			//System.out.println(a[0]);
			if(a[0].equals("G:"))
			{
				boy=false;
			}
			else
			{
				boy=true;
			}
			
			//for(String x:a)
			//	System.out.println(x);
			
		
			
			for(int j=1;j<a.length;j++)
			{			
				//System.out.println("Inner loop");
				try 
				{
					//System.out.println("WTF");
					int x=Integer.parseInt(a[j]);
					//System.out.println(hm.get(x));
					if(hm.get(x)==null)
					{
						if(boy)
							hm.put(x, 1);
						else
							hm.put(x, 2);
					}
					else
					{
						if(boy)
							hm.put(x,hm.get(x)+1);
						else
							hm.put(x,hm.get(x)+2);
					}
					
				}
				catch (Exception e)
				{
					//System.out.println(a[j]);
				}
				
				
			}
		}
		
		int max=0;
		int day=0;
		for ( Map.Entry<Integer,Integer> entry : hm.entrySet()) 
		{
			if(entry.getValue()>max)
			{
				max=entry.getValue();
				day=entry.getKey();
			}
			//System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		if(day==19 || day==20)
			System.out.println("Date");
		else
			System.out.println("No Date");
		
	}
	
}
