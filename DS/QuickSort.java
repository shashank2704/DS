/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;
/**
 *
 * @author Vinayak
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[]{31,16,7,8,9,10};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    static void quickSort(int[] a,int s,int e){
        if(s<e){
            int p = partition(a,s,e);
            quickSort(a, s, p-1);
            quickSort(a, p+1, e);
        }
    }
    static int partition(int[] a,int s,int e){
        int k=s;
        for(int i=s;i<e;i++){
            if(a[i]<=a[e]){
                int t=a[k];
                a[k]=a[i];
                a[i]=t;
                k++;
            }
        }
        int t=a[k];
        a[k]=a[e];
        a[e]=t;
        return k;
    }
}
