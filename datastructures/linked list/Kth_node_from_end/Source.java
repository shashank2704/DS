import java.util.*;

public class Source {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int n) {
            data = n;
            next = null;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        head = null;
        if (n > 0) {
            head = new Node(s.nextInt());
            Node temp = head;
            for (int i = 1; i < n; i++) {
                temp.next = new Node(s.nextInt());
                temp = temp.next;
            }
        }
        int k = s.nextInt();
        kthNodeFromEnd(k);
    }

    // Method to find kth element from the end in the LinkedList
    static void kthNodeFromEnd(int k) {
       int count =0;
       Node temp=head;
       while(temp!=null)
       { 
           temp=temp.next;
           count++;
       }
       if(k>count)
       {
           System.out.println("Not Possible");
       }
       else if(k<=count)
       {
           int p = count-k;
           int i=1;
           Node temp2= head;
           while(temp2.next!=null && i++<=p)
           {
               temp2=temp2.next;
               
           }
           System.out.println(temp2.data);
           
       }
    }
}
