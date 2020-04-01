/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;

/**
 *
 * @author Vinayak
 */
class Nodee{
    int data;
    Nodee next;
    Nodee prev;
    Nodee(int data){
        this.data=data;
    }
}
public class DblyLinkedList {
    Nodee head;
    void insertAtBegin(int x){
        Nodee temp=new Nodee(x);
        if(head==null)
            head=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }
    void insertAtEnd(int x){
        Nodee temp=new Nodee(x);
        Nodee temp1=head;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=temp;
        temp.prev=temp1;
    }
    void display(){
        Nodee temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        DblyLinkedList obj=new DblyLinkedList();
        obj.insertAtBegin(10);
        obj.insertAtBegin(20);
        obj.insertAtBegin(30);
        obj.insertAtBegin(40);
        obj.insertAtEnd(50);
        obj.display();
    }
}
