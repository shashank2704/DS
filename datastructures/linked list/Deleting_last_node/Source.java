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
        deleteLastNode();
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Method to delete the first node of the LinkedList
    static void deleteLastNode() {
      Node temp=head;
      if(temp.next!=null && temp.next.next!=null)
      {
          while(temp.next.next!=null)
          {
              temp=temp.next;
          }
          temp.next=null;
      }
      else if(temp==null)
      {
          return;
      }
      else if(temp.next==null)
      {
          head=null;
      }
        else if(temp.next.next==null)
       {
           temp.next=null;
           head=temp;
       }
    }
}
