import java.util.*;
 class heap
{
static int arr[]=new int[]{20,12,13,19,14,15,16,17};
void heapify(int index)
{
    int i=index;
    int l=2*i+1;
    int r=2*1+2;
    int min=index;
    if(l<arr.length && arr[l]<arr[min])
    {
        min=l;
    }
    if(l<arr.length&&arr[r]<arr[min])
    {
        min=r;
    }
    if(min!=i)
    {
        int t=arr[min];
        arr[min]=arr[i];
        arr[i]=t;
        heapify(min);
    }
}
void build_heap()
{
    for(int i=(arr.length)/2;i>=0;i--)
    {
        heapify(i);
    }
}
void print()
{
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}
public class example2
{
    public static void main(String[] args) {
        heap h1=new heap();
h1.heapify(0);
h1.print();
h1.build_heap();
System.out.println();
h1.print();
    }
}