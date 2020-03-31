class Node
{
    int data;
    Node next;
    Node (int data)
    {
        this.data=data;
        next=null;
    }
}
public class LinkedListExample
{
static Node head=null;
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
if(head!=null)
{
    Node temp=head;
    while(temp.next !=null)
    {
        temp=temp.next;
    }
    
    temp.next=newNode;
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
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}
else{
    System.out.println("List is empty");
}
}
public void insertAtBegin(int value)
{
    Node node=new Node(value);
    
    if(head!=null)
    {
        node.next=head;
        head=node;
    }
    else
    {
        head=null;
    }
}
public void insertAtIndex(int index,int data,LinkedListExample obj)
{
int size=0;
Node newNode = new Node(data);

size=obj.sizeofList();
System.out.println(size);

if(head!= null && index==0)
{
obj.insertAtBegin(data);
}
else if(head != null && index>size)
{
obj.insertAtEnd(data);
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
}
public int sizeofList()
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

public static void main(String[] args) {
    LinkedListExample l1 = new LinkedListExample();
    l1.insertAtEnd(10);
    l1.display();
    l1.insertAtEnd(20);
    l1.display();
    l1.insertAtEnd(30);
    l1.display();
    l1.insertAtBegin(50);
    l1.display();
    l1.insertAtIndex(2,23,l1);
    l1.display();
}
}
