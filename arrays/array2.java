import java.util.*;
public class array2
{
    //max and min of a 2d array
  static  int  max(int arr[])
    {
int m=arr[0];
for(int i=0;i<arr.length;i++)
{
if(m<arr[i])
{
    m=arr[i];
}
}
return m;
    }
 static   int min (int arr[])
    {
int m=arr[0];
for(int i=0;i<arr.length;i++)
{
if(m>arr[i])
{
    m=arr[i];
}
}
return m;
    }
    public static void main(String[] args) {
        int arr[][]= new int[2][3];
        int p = arr.length;
        int sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter elemnts : \n" );
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
               arr[i][j]=sc.nextInt();
               sum+=arr[i][j];
           }
       }
       int arr1[]= new int[p];
       int arr2[]= new int[p];
       for(int r=0;r<p;r++)
       {

        arr1[r]=max(arr[r]);
        arr2[r]=min(arr[r]);

       }
       int maxi,mini;
       maxi = max(arr1);
       mini=min(arr2);
       System.out.println("max = "+ maxi);
       System.out.println("min = "+ mini);
       System.out.println("avg = "+sum/6);
       
    }
}