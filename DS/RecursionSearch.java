/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinayak
 */
public class RecursionSearch {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int n=s1.nextInt();
        System.out.println("Enter array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s1.nextInt();
        Arrays.sort(arr);
        System.out.println("Enter no to search");
        int d=s1.nextInt();
        if(search(arr,d,0,arr.length-1)<0)
            System.out.println("Not found");
        else
            System.out.println("Found at "+search(arr,d,0,arr.length-1));
    }
    static int search(int arr[],int d,int l,int h){
        if(l<=h)
        {
         int mid=(l+h)/2;
        
        if(arr[mid]==d)
                return mid;
        if(arr[mid]<d)
                return search(arr,d,mid+1,h);
        else
                return search(arr,d,1,mid-1);
        }
        
            return -1;
    }
}
