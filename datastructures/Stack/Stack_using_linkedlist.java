import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class Stack_using_linkedlist
{
  Node head=null;
  public void push(int x)
  {
      Node temp=head;
      Node temp1=new Node(x);
      if(head==null)
        head=temp1;
else{
temp1.next=head;
head=temp1;
}

  } 
  public void pop()
  {
if(head==null)
{
    System.out.println("underflow");
    return;
}
else
{
Node temp=head.next;
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
public static void main(String[] args) {
    Stack_using_linkedlist s = new Stack_using_linkedlist();
    s.push(10);
    s.push(20);
    s.push(30);
    s.pop();
    s.display();
}
}