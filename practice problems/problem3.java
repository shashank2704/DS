import java.util.*;
public class problem3
{
    //count set bits 
    public static void main(String[] args) {
int n=12;
int count=0;
while(n!=0)
{
    if((n&1)==1)
    {
        count++;
    }
    n=n>>1;
}
System.out.print(count);
    }
}