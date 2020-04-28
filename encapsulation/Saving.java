 class Bank
{
    private static int saving;

    public void set(int n)
    {
        saving=n;
    }
    public int get()
    {
        return saving;
    }
    public void increment()
    {
        if(saving>=1000)
        {
        saving+=1000;
        }
    }
    public void decrement()
    {
        if(saving>=1000&& saving>0)
        {
        saving-=100;
        }
    }
    public void checksaving()
    {
        if(saving<1000&& saving>0)
        {
            System.out.println("Insufficient savings");
        }
        else if(saving>1000)
        {
            System.out.println("Congratulations you have saved a good amount!");
        }
        else
        {
            System.out.println("you are in debt");
        }
    }
}

public class Saving{
    public static void main(String[] args) {
        Bank b1 = new Bank();
     b1.set(-200);
     b1.increment();
     b1.decrement();
    b1.checksaving();
    System.out.println("total savings : "+b1.get());

    }
}