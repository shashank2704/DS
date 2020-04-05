import java.util.*;
public class bubblesort
{
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,7,4,8,6,0};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-j;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}