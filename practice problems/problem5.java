import java.util.*;
public class problem5
{
    public static void main(String[] args) {
        int arr[]=new int[]{1,1,2,2,3,4,4};
        int result=0;
        int sum,x;
        for(int i=0;i<32;i++)
        {
            sum=0;
            x=1<<i;
            for(int j=0;j<7;j++)
            {
                if((arr[j]&x)!=0)
                {
                    sum++;
                }
                if((sum%2)!=0)
                {
                    result=result|x;
                }
            }
        }
        System.out.println(result);
    }
}