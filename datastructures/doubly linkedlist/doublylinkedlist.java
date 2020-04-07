class Node
{
    Node prev;
    Node next;
    int data;
    Node(int d)
    {
        data=d;
    }
}
public class doublylinkedlist
{
    Node head;
    void insert_at_beg(int x)
    {
        Node temp=new Node(x);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
    void insert_at_end(int x)
    {
        Node temp=new Node(x);
        Node temp1=head;
        if(head==null)
        {
            head=temp;
        }
        else
        {
        while(temp1.next!=null)
        {
            temp1=temp1.next;

        }
        temp1.next=temp;
        temp.prev=temp1;
        }
    }


    public static void main(String[] args) {
        doublylinkedlist l1 =new doublylinkedlist();
        l1.insert_at_beg(10);
        l1.insert_at_beg(20);
        l1.insert_at_end(30);
        l1.display();

    }
}