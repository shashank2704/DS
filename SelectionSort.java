/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;

/**
 *
 * @author Vinayak
 */
public class SelectionSort {
    public static void main(String[] args) {
        int arr[]=new int[]{16,17,7,8,9};
        arr=selectionSort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    static int[] selectionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int min=a[i];
            int pos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    pos=j;
                }
            }
            a[pos]=a[i];
            a[i]=min;
        }
        return a;
    }
}
