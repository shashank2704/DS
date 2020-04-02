public class queue
{
	int arr[];
	int front, rear;
	queue()
	{
		arr=new int[100];
		front=rear=-1;
	}
	void enqueue(int x)
	{
		if(rear==arr.length-1)
		{
			System.out.println("Overflow");
			return;
		}
		arr[++rear]=x;
		if(rear==0)
			front=0;
	}
	int dqueue()
	{
		if(front==-1)
		{
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
	void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		queue a=new queue();
		a.enqueue(10);
		a.enqueue(20);
		a.enqueue(30);
		a.enqueue(40);
		a.enqueue(50);
		a.display();
		System.out.println(a.dqueue());
	}
	
}
