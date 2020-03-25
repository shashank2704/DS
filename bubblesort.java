/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;

/**
 *
 * @author Vinayak
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        bubblesort(arr);
    }
    static void bubblesort(int[] arr){
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=false;
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
            if(flag){
                    System.out.println("Sorted already");
                    break;
                }
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
