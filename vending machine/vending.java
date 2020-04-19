import java.util.*;
public class vending
{
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    String s="";
    System.out.println("enter amount : ");
    while(s!="n")
    {
        int n;
      n=sc.nextInt();
if(n==10)
{
    System.out.println("chips bought");
}
else
if(n==20)
{
    System.out.println("chocolate bought");
}
else 
if(n==30)
{
    System.out.println("coke bought");
}
else 
{
    System.out.println("wrong input");
}

System.out.println("Do you wanna continue??");
s=sc.next();
    }
}
}