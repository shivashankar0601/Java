import java.util.ArrayList;

public class NewPrimeGeneration 
{
	public static void main(String[] args) 
	{
		//System.out.print();		
		java.util.Scanner scan = new java.util.Scanner (System.in);		
		int n=scan.nextInt();
		//int a[] = new int[n];
		ArrayList <Integer>al = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
			al.add(scan.nextInt());
		int a=0,b=0,c=0;
		while(al.size()>=9)
		{
			a=b=c=0;
			a=(al.get(0).intValue()+al.get(3).intValue()+al.get(6).intValue());
			b=(al.get(1).intValue()+al.get(4).intValue()+al.get(7).intValue());
			c=(al.get(2).intValue()+al.get(5).intValue()+al.get(8).intValue());
			System.out.print(a+" "+b+" "+c+" ");	
			al.remove(8);
			al.remove(7);					
			al.remove(6);
			al.remove(5);
			al.remove(4);
			al.remove(3);
			al.remove(2);
			al.remove(1);
			al.remove(0);
		}
		if(al.size()>=8)
		{
			a=b=c=0;
			a=(al.get(0).intValue()+al.get(3).intValue()+al.get(6).intValue());
			b=(al.get(1).intValue()+al.get(4).intValue()+al.get(7).intValue());
			c=(al.get(2).intValue()+al.get(5).intValue());
			System.out.print(a+" "+b+" "+c);
			al.remove(7);					
			al.remove(6);
			al.remove(5);
			al.remove(4);
			al.remove(3);
			al.remove(2);
			al.remove(1);
			al.remove(0);
			
		}
		
		if(al.size()>=7)
		{
			a=b=c=0;
			a=(al.get(0).intValue()+al.get(3).intValue()+al.get(6).intValue());
			b=(al.get(1).intValue()+al.get(4).intValue());
			c=(al.get(2).intValue()+al.get(5).intValue());
			System.out.print(a+" "+b+" "+c);
			al.remove(6);
			al.remove(5);
			al.remove(4);
			al.remove(3);
			al.remove(2);
			al.remove(1);
			al.remove(0);
			
		}

		if(al.size()>=6)
		{
			a=b=c=0;
			a=(al.get(0).intValue()+al.get(3).intValue());
			b=(al.get(1).intValue()+al.get(4).intValue());
			c=(al.get(2).intValue()+al.get(5).intValue());
			System.out.print(a+" "+b+" "+c);
			al.remove(5);
			al.remove(4);
			al.remove(3);
			al.remove(2);
			al.remove(1);
			al.remove(0);				
			
		}
		
		if(al.size()>=5)
		{
			a=b=c=0;
			a=(al.get(0).intValue()+al.get(3).intValue());
			b=(al.get(1).intValue()+al.get(4).intValue());
			c=(al.get(2).intValue());
			System.out.print(a+" "+b+" "+c);
			al.remove(4);
			al.remove(3);
			al.remove(2);
			al.remove(1);
			al.remove(0);										
								
			
		}
		
		if(al.size()>=4)
		{
			a=b=c=0;
			a=(al.get(0).intValue()+al.get(3).intValue());
			b=(al.get(1).intValue());
			c=(al.get(2).intValue());	
			System.out.print(a+" "+b+" "+c);
			al.remove(3);
			al.remove(2);
			al.remove(1);
			al.remove(0);									
			
		}
		
		if(al.size()>=3)
		{
			a=b=c=0;
			a=(al.get(0).intValue());
			b=(al.get(1).intValue());
			c=(al.get(2).intValue());
			System.out.print(a+" "+b+" "+c);
			al.remove(2);
			al.remove(1);
			al.remove(0);
			
		}
		
		if(al.size()>=2)
		{
			a=b=c=0;
			a=(al.get(0).intValue());
			b=(al.get(1).intValue());
			c=0;
			System.out.print(a+" "+b+" "+c);
			al.remove(1);
			al.remove(0);
			
		}
		if(al.size()==1)
		{
			a=b=c=0;
			a=al.get(0).intValue();
			b=0;
			c=0;
			System.out.print(a+" "+b+" "+c);
			al.remove(0);

		}
		
	}
		
	
	
}
