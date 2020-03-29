class Node1{
    Node1 next;
    int data;
    Node1(int data){
        this.data=data;
    }
}
public class node_stack {
    Node head;

    void push(int x) {
        Node newNode = new Node(x);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    int pop() {
        int temp = 0;
        if (head != null) {
            temp = head.data;
            head = head.next;
        }
        return temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node_stack s = new node_stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println(s.pop());
        s.display();
    }
}