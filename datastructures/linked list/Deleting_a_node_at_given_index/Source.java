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
        int index = s.nextInt();
        deleteNodeAtGivenIndex(index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the node at the given index of the LinkedList
    static void deleteNodeAtGivenIndex(int index) {
       Node temp=head;
      
       int i=1;
       int count=0;
       Node temp2=head;
       while(temp2!=null)
       {
           count++;
           temp2=temp2.next;
       }
     
       if(index<=count ){
       if(temp==null)
       {
           return;
       }
       else if(temp!=null)
       {
        while(i<index-1)
           {
      
               temp=temp.next;
               i++;
           }
           Node temp3=temp.next;
           temp.next=temp.next.next;
           temp3.next=null;
       }
       else if(temp!=null && i==index)
       {
           head=temp.next;
           return;
       }
      
       }
       
       
       
       
    }
}
