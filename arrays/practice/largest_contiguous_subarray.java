import java.util.*;
public class first_occurance
{
    public static void main(String[] args) {
        int ans=0;
        int arr[]=new int[]{15,2,2,-8,1,7,10,25};
        for(i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(k=i;k=j;k++)
                {
                    ans+=arr[k];
                }
            }
        }
        System.out.println(ans);
        
    }
}