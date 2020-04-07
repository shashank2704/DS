import java.util.*;
public class Stack_example{
    int arr[];
    int top;
    Stack_example()
    {
        top=-1;
        arr=new int[100];
    }
    void push(int x)
    {
        if(top==(arr.length-1))
        {
            System.out.println("overflow");
            return;
        }
arr[++top]=x;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
            return 0;
        }
        int x=arr[top];
        top--;
        return x;
    }
    int peek()
    {
      if(top==-1)
      {
          System.out.println("underflow");
          return 0;
      }
      return arr[top];
    }
void insert_at_beg(int x) //push
{
if(top==(arr.length-1))
{
System.out.println("overflow");
return;
}
arr[++top]=x;
}
int delete_from_beg()
{
    int x=0;
    if(top==-1)
    {
        System.out.println("underflow");
        return 0;
    }
 x=arr[top];
    top--;
return x;
}

    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    Boolean isempty()
    {
if(top==-1)
{
    return true;
}
return false;
    }
    public static void main(String[] args) {
        Stack_example s=new Stack_example();
        s.push(10);
        s.push(20);
        s.push(30);
        s.insert_at_beg(50);
        s.pop();
        System.out.println(s.peek());
        s.display();
    }
}