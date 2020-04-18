import java.util.*;
public class exception2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s="";
        while(s!="no")
        {
            try{
System.out.println("enter key : ");
n= sc.nextInt();
if(n!=5 && n!=6)
{
    throw new myexception("wrong input");
}
else{
System.out.println("do you wanna continue ");

s=sc.next();
}
            }
            catch(myxception e)
            {
                e.printStackTrace();
            }
        }
        
        
    }
}
 class myexception extends Exception
{
    myexception(String k)
    {
        super(k);
    }
}