import java.util.*;
public class first_occurance
{
    public static void main(String[] args) {
        int arr[]=new int[]{11,12,13,13,14,14,14,14,15};
        int target=14;
        int l=0;
        int ans=0;
        int h=arr.length-1;
        while(l<=h)
        {
int mid=(l+h)/2;
if(arr[mid]<target)
{
l=mid+1;
}
else if(arr[mid]>target)
{
    h=mid-1;
}
else{
ans=mid;
h=mid-1;
}
        }
        System.out.println("index: "+ans);
    }
}