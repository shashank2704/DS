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