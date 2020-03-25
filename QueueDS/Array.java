/*
 * Alt + Shift + F to indent lines.
 */
package QueueDS;

/**
 *Its a liner data structure
 */
public class Array {
    int[] arr;
    int front,rear;
    Array(){
        arr=new int[100];
        front=rear=-1;
    }
    void enqueue(int x){  //Enter in Queue
        if(rear==arr.length-1){
            System.out.println("Overflow");
            return;
        }
        arr[++rear]=x;
        if(rear==0) front=0;
    }
    int dequeue(){
        if(front==-1){
            System.out.println("Underflow");
            return -1;
        }
        int x=arr[front];
        if(front==rear)
            front=rear=-1;
        else
            front++;
        return x;
    }
    void display(){
        if(front!=-1){
            for(int i=front;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else
            System.out.println("UnderFlow");
    }
    public static void main(String[] args) {
        Array n = new Array();
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
