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
        int index = s.nextInt();
        addAtGivenIndex(k, index);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to add the element at the front of the LinkedList
    static void addAtGivenIndex(int k, int index) {
     if(head==null)
     {
         head = new Node(k);
     }
     else
     {
         int i=0;
         Node temp=head;
         while(temp.next!=null && i++<index-1)
         {
             temp=temp.next;
         }
         Node temp2= new Node(k);
         temp2.next=temp.next;
         temp.next=temp2;
     }
      
    }
}
