/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;

/**
 *
 * @author Vinayak
 */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class LinkedLIST {
    Node head;
    void insertBeg(int x){
        Node temp = new Node(x);
        if(head==null)
            head=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }
    void insertEnd(int x){
        Node newNode = new Node(x);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    void deleteBeg(){
        if(head!=null)
            head=head.next;
        else
            System.out.println("List is empty");
    }
    void deleteEnd(){
        if(head!=null){
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    void deleteAtPos(int pos){
        if(pos==1){
            head=head.next;
            return;
        }
        if(head!=null){
            Node temp=head;
            for(int i=0;i<pos-2;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    void reverse(){
        Node curr,prev,next;
       curr=head;
        prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    void findMid(){
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Mid is "+slow.data);
    }
    public static void main(String[] args) {
        LinkedLIST obj = new LinkedLIST();
        obj.insertBeg(5);
        obj.insertEnd(6);
        /*obj.deleteBeg();
        obj.insertEnd(8);
        obj.insertEnd(10);
        obj.deleteEnd();*/
        obj.insertEnd(7);
        obj.insertEnd(34);
        obj.insertEnd(11);
        obj.insertEnd(31);
        obj.insertEnd(12);
        obj.insertEnd(90);
        obj.insertEnd(56);
        obj.insertEnd(30);
        obj.deleteAtPos(1);
        obj.insertEnd(21);
        obj.display();
        obj.reverse();
        obj.display();
        obj.findMid();
    }
}
