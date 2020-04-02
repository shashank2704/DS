class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class LListqueue {
    Node head,front,rear;
    void enqueue(int x){
        Node newNode=new Node(x);
        /*if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newNode;
        }*/
        if(front==null){
            front=newNode;
            rear=front;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    int dequeue(){
        /*if(head!=null){
            Node temp=head;
            int x=temp.data;
            head=temp.next;
            return x;
        }
        else{
            System.out.println("UnderFlow");
            return -1;
        }*/
        int x=front.data;
        front=front.next;
        return x;
    }
    void display(){
        /*Node temp=head;
        if(head!=null){
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }*/
        Node temp=front;
        while(temp!=rear){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
            
    }
    public static void main(String[] args) {
        LList n = new LList();
        n.enqueue(10);
        n.enqueue(20);
        n.enqueue(30);
        n.enqueue(40);
        n.enqueue(50);
        n.display();
        System.out.println("Dq "+n.dequeue());
        n.display();
    }
}