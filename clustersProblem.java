
public class clustersProblem // islands problem
{
	public static int r=3,c=5,res=0,a[][]= {{1,0,1,0,1},
							          		{1,0,0,1,0},
							          		{0,1,1,0,1}};
	
	public static void main ( String ... args )
	{
		findNumberOfClusters();
		System.out.println(res);
	}
	
	private static void findNumberOfClusters()
	{
		
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				if(a[i][j]!=0 && Visit(a,i,j)==1)
					res++;
	}

	private static int Visit(int[][] a, int i, int j) 
	{
		if(i<0 || j<0 || i>=r || j >=c || a[i][j]==0)
			return 0;
		
		if(a[i][j]==1)
			a[i][j]=0;
		
		return 1 | (Visit(a,i-1,j-1) | Visit(a,i-1,j) |  Visit(a,i-1,j+1) | Visit(a,i,j-1) | Visit(a,i,j+1) | Visit(a,i+1,j-1)| Visit(a,i+1,j)| Visit(a,i+1,j+1) ) ; 
		
	}
}