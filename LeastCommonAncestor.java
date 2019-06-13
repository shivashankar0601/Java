
public class LeastCommonAncestor 
{

	static TreeNode root=null;
	
	public static void main(String[] args) 
	{
		buildTree();
		//printTree(root);
		TreeNode lca = findLCA(root,10,19);
		if(lca!=null)
			System.out.println(" LCA "+lca.data);
		else
			System.out.println("no LCA found");
		
		
		
		
		
	}
	
	
	
	private static TreeNode findLCA(TreeNode root, int x, int y)
	{
		if (root == null) 
            return null; 

        if (root.data == x || root.data == y) 
            return root; 
  
        TreeNode left_lca = findLCA(root.left, x, y); 
        TreeNode right_lca = findLCA(root.right, x, y); 
  
        if (left_lca!=null && right_lca!=null) 
            return root; 
  
        return (left_lca != null) ? left_lca : right_lca; 
	}



	public static void buildTree()
	{
		root = new TreeNode();
		root.data=27;
		(root.left= new TreeNode()).data=14;
		(root.right= new TreeNode()).data=35;
		(root.left.left= new TreeNode()).data=10;
		(root.left.right= new TreeNode()).data=19;
		(root.right.left= new TreeNode()).data=31;
		(root.right.right= new TreeNode()).data=42;
	}

	public static void printTree(TreeNode root)
	{
		if(root!=null)
		{
			printTree(root.left);
			System.out.print(root.data+" ");
			printTree(root.right);
		}
				
	}
	
	
	
	
	
	
}

class TreeNode
{
	int data;
	TreeNode left = null;
	TreeNode right = null;
	
}
