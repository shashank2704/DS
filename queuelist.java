class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class queuelist
{
    Node head=null;
    void enqueue(int x)
    {
        Node newnode=new Node(x);
        
        if(head==null)
        {
            head=newnode;
            
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            
        }
    }
        int deqeue()
        {
           
            if(head==null)
            {
                System.out.println("overflow");
                return -1;
                
            }
            else
            {
                Node temp=head;
                
                int x=temp.data;
                head=temp.next;
                return x;
            
            }
            
        }
        void display()
        {
            Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
        }
        
        
    public static void main(String args[])
    {
        queuelist a=new queuelist();
        a.enqueue(10);
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);
		a.display();
		System.out.println(a.deqeue());
        
    }
}