//import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    } 
}
class LinkedListDemo
{
    static Node head=null;
    public void insertAtEnd(int data)
    {
        Node newNode=new Node(data);
        if(head != null)
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
           
            temp.next= newNode;
        }
        else
        {
            head=newNode;
        }

    }
    public void display()
    {
        if(head!=null)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
        }
        else
        {
            System.out.println("list is empty");
        }   
    }
    public static void main(String ar[])
    {
        //Scanner sc=new Scanner(System.in);
        LinkedListDemo n=new LinkedListDemo();
        n.insertAtEnd(3);
       // n.display();
        n.insertAtEnd(2);
       // n.display();
        n.insertAtEnd(1);
        n.display();
    }
}