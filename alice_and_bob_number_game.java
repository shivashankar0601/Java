
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class alice_and_bob_number_game 
{
	public static ArrayList<Integer> al = new ArrayList<Integer>();
	
	static void printArr(int a[], int n) 
    {
		StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) 
            sb.append(a[i]);
        al.add(Integer.parseInt(sb.toString()));
    } 
  
    //Generating permutation using Heap Algorithm 
    static void heapPermutation(int a[], int size, int n) 
    { 
        // if size becomes 1 then prints the obtained 
        // permutation 
        if (size == 1) 
            printArr(a,n); 
  
        for (int i=0; i<size; i++) 
        { 
            heapPermutation(a, size-1, n); 
  
            // if size is odd, swap first and last 
            // element 
            if (size % 2 == 1) 
            { 
                int temp = a[0]; 
                a[0] = a[size-1]; 
                a[size-1] = temp; 
            } 
  
            // If size is even, swap ith and last 
            // element 
            else
            { 
                int temp = a[i]; 
                a[i] = a[size-1]; 
                a[size-1] = temp; 
            } 
        } 
    } 
	
    public static void main(String args[]) 
    { 
    	System.out.println();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(s.length()==1)
        {
        	System.out.println("Not possible!");
        	return;
        }
        long l = Long.parseLong(s);
        int a[] = new int[s.length()];
        int i=0;
        while(l>0)
        {
        	int r =(int) l%10;
        	a[i++]=r;
        	l/=10;
        }
        al.clear();
        heapPermutation(a, a.length, a.length);
        if(al.size()<3)
        {
        	System.out.println("Not possible!");
        	return;
        }
        a = new int[al.size()];        

        for(i=0;i<al.size();i++)
        	a[i]=al.get(i);
        
        Arrays.sort(a);
        //for(int x : a)
        //	System.out.println(x);
        System.out.println(a[2]+" "+a[a.length-3]);
    } 
	
}
