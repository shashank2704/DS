import java.util.*;
class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d)
    {
        data=d;
        left=right=null;
    }
    void preOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    void inOrder(TreeNode root)
    {
       
       if(root==null)
       {
           return;
       }
       inOrder(root.left);
       System.out.print(root.data+" ");
       inOrder(root.right);
    }
    int countLeaves(TreeNode node) 
    {
         if(node==null)
         {
             return 0;
         }
         if(node.left==null && node.right==null)
         {
             return 1;
         }
         return countLeaves(node.left)+countLeaves(node.right);
    }
    public int SumofLeafNodes(TreeNode root)
    {
       if(root==null)
       {
           return 0;
       }
       if(root.right==null&&root.left==null)
       {
           return root.data;
       }
       return SumofLeafNodes(root.left)+SumofLeafNodes(root.right);
    }

    int height(TreeNode root) 
    {
        if (root==null)
        {
            return 0;
        }
        int hl=height(root.left);
        int hr=height(root.right);
        return Math.max(hl,hr)+1;
    } 
    boolean isIdentical(TreeNode root1, TreeNode root2)
	{
	if(root1==null&&root2==null)
	{
	    return true;
	}
	if(root1==null&&root2!=null)
	{
	    return false;
	}
		if(root1!=null&&root2==null)
	{
	    return false;
	}
		if(root1.data!=root2.data)
		{
		    return false;
		}
return isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right);
    } 
    
 void levelOrder(TreeNode node) 
    {
       Queue <TreeNode> q=new LinkedList<>();
       q.add(node);
      
       while(!q.isEmpty())
       {
           TreeNode temp=q.poll();
          System.out.print(temp.data+" ");
          if(temp.left!=null)
          {
              q.add(temp.left);
          }
            if(temp.right!=null)
          {
              q.add(temp.right);
          }
       }
       
    }

     // Recursive function to print right view of a binary tree.
     void printKdistance(TreeNode root, int k)
     {
          if(root==null)
          {
              return;
          }
          if(k==0)
          {
              System.out.print(root.data+" ");
              return;
          }
          printKdistance(root.left,k-1);
          printKdistance(root.right,k-1);
     }
     public TreeNode sortedArrayToBST(final List<Integer> a) {
	    
	    return tobst(a,0,a.size()-1);
	}
	public TreeNode tobst(final List<Integer> a,int s,int e)
	{
	    if(s>e)
	    {
	        return null;
	    }
	    int mid=(s+e)/2;
	    TreeNode root=new TreeNode(a.get(mid));
	    root.left=tobst(a,s,mid-1);
	    root.right=tobst(a,mid+1,e);
	    return root;
	}


}
public class example1
{
public static void main(String[] args) {
    TreeNode root =new TreeNode(10);
    root.left=new TreeNode(20);
    root.right=new TreeNode(30);
    root.levelOrder(root);
}
}