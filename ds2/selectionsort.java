import java.util.*;
public class selectionsort
{
    public static void main(String[] args) {
        int arr[]=new int[]{16,17,7,8,9};
        int m=0;
for(int i=0;i<arr.length;i++)
{
    m=i;
    
    for(int j=i+1;j<arr.length;j++)
    {
        if(arr[m]>arr[j])
        {
            m=j;
        }

    }
if(m!=i)
{
    int t=arr[m];
    arr[m]=arr[i];
    arr[i]=t;
}
}
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}

    }
}