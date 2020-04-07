import java.util.*;
class Node{
    Node root;
    int data;
    Node left;
    Node right;
    Node(int d)
    {
data=d;
left=null;
right=null;
    }
    Node insert(Node root,int d)
    {
        if(root==null)
        {
            root=new Node(d);
            return root;
        }
        if(root.data>d)
        {
            root.left=insert(root.left,d);
        }
        else
       root.right= insert(root.right,d);
       return root;
    }
    void print(Node root)
    {
        if(root==null)
        {
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
    
        public Node sortedArrayToBST(final List<Integer> a) {
            
            return tobst(a,0,a.size()-1);
        }
        public Node tobst(final List<Integer> a,int s,int e)
        {
            if(s>e)
            {
                return null;
            }
            int mid=(s+e)/2;
            Node root=new Node(a.get(mid));
            root.left=tobst(a,s,mid-1);
            root.right=tobst(a,mid+1,e);
            return root;
        }
    
    
        public int kthsmallest(Node A, int B) {
            ArrayList<Integer> al=new ArrayList<>();
            inorder(A,al);
              return al.get(B-1);  
                
                }
                public void inorder(Node A,ArrayList<Integer> l1)
                {
                     if(A==null)
                    {
                        return;
                    }
                  inorder(A.left,l1);
                    l1.add(A.val);
                    inorder(A.right,l1);
                }


}
public class bst
{
    public static void main(String[] args) {
        Node root=new Node(10);
        Node n1=root.insert(root,15);
        Node n2=root.insert(root,5);
        Node n3=root.insert(root,13);
        root.print(root);
    }
}