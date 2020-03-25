import java.util.*;
public class binarysearch
{
    public static int search(int arr[],int d)
    {

int l=0;
int h=arr.length-1;

while(l<=h)
{
    int mid=(l+h)/2;
    if(arr[mid]==d)
    {
        return arr[mid];
    }
   
if(arr[mid]<d)
{
    l=mid+1;
}
else
{
    h=mid-1;
}

}
return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,6,7,3,5};
        Arrays.sort(arr);
        System.out.println(search(arr,9));  
    }
}