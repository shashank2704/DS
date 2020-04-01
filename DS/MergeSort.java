/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;
/**
** ALGORITHM:
* void mergeSort(int a[],int s,int e){
*   if(s<e){
*       int mid = (s+e)/2;
*       mergeSort(a,s,mid);
*       mergeSort(a,mid+1,e);
*       merge(a,s,mid,mid+1,e);
*   }
* }
**/
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {9,45,76,23,47,1,5,11};
        mergeSort(arr,0,arr.length-1);
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void mergeSort(int[] arr,int s,int e){
        if(s<e){
            int mid=(s+e)/2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, e);
            merge(arr,s,mid,e);
        }
    }
    static void merge(int[] a,int s,int m,int e){
        int L[] = new int[m-s+1];
        int R[] = new int[e-m];
        int p=0,q=0,i;
        for(i=s;i<=e;i++){
            if(i<=m)
                L[p++]=a[i];
            else
                R[q++]=a[i];
        }
        p=q=0;i=s;
        while(p<L.length && q<R.length){
            if(L[p]<R[q])
                a[i++]=L[p++];
            else
                a[i++]=R[q++];
        }
        while(p<L.length)
            a[i++]=L[p++];
        while(q<R.length)
            a[i++]=R[q++];
    }
}