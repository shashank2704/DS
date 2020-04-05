import java.util.*;
public class insertionsort
{
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,7,4,8,6,0};
       
for(int i=1;i<arr.length;i++)
{
    int t=arr[i];
    int j=i-1;
    while(j>=0 && arr[j]>t)
    {
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=t;
}





        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}