import java.util.*;
public class partition
{
    public static void main(String[] args) {
        int arr[]=new int[]{2,6,9,-1,-4,10,-7,3,5,-8};
        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
for(int i=0;i<arr.length;i++)
{
    if(arr[i]<0)
    {
        l1.add(arr[i]);
    }
    if(arr[i]>0)
    {
        l2.add(arr[i]);
    }
}
if(arr[0]>0)
{
    System.out.print(l2);
    System.out.print(l1);

}
else
{
System.out.print(l1);
System.out.print(l2);
}

    }
}