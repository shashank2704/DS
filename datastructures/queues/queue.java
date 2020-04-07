import java.util.*;
public class queue
{
    int arr[];
    int front,rear;
    queue()
    {
        arr=new int[100];
        front=rear=-1;
    }
void enqueue(int x)
{
    if(rear==arr.length-1)
    {
        System.out.println("overflow");
        return;
    }
    arr[++rear]=x;
    if(rear==0)
    {
        front=0;
    }
}
int dequeue()
{
    if(front==-1)
    {
        System.out.println("underflow");
        return -1;
    }
    int x=arr[front];
    if(front==rear)
    {
        front=rear=-1;
    }
    else
    front++;
    return x;
}
void display()
{
    if(front!=-1)
    {
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    else
    System.out.println("underflow");
}
public static void main(String[] args) {
    queue q1=new queue();
    q1.enqueue(10);
    q1.enqueue(20);
    q1.enqueue(30);
    q1.enqueue(40);
    q1.enqueue(50);
    q1.display();
    q1.dequeue();
    q1.display();
}

}