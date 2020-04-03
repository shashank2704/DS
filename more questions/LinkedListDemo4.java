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
    public int sizeOfList()
    {
        int count=0;
        if(head!=null)
        {
            Node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
        }
        return count;
    }
    public void insertAtBegining(int k)
    {
        Node newNode=new Node(k);
          if(head!=null)
            {
                newNode.next=head;
                head=newNode;
            }
            else{
                head=newNode;
            }
    }
    public void insertAtEnd(int k)
    {
        Node newNode=new Node(k);
        if(head!=null)
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        else{
            head=newNode;
        }
    }

    // Method to add the element at the front of the LinkedList
    static void addAtGivenIndex(int k, int index) {
        // Write your code here
        Source s=new Source();
        int size=0;
        Node newNode=new Node(k);
        size=s.sizeOfList();
        if(head!=null && index==0)
        {
            s.insertAtBegining(k);
        }
        else if(head!=null && index>size)
        {
            s.insertAtEnd(k);
        }
        else if(head!=null && index<=size)
        {
            Node temp=head;
            int i=0;
            while(i!=index-1)
            {
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        else{
            head=newNode;
        }
    }
}
