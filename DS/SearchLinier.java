/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;
import java.util.*;
/**
 *
 * @author Vinayak
 */
public class SearchLinier {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size");
        int n=s1.nextInt();
        System.out.println("Enter array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s1.nextInt();
        System.out.println("Enter no to search");
        int d=s1.nextInt();
        if(search(arr,d)<0){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at "+search(arr,d));
        }
    }
    static int search(int arr[],int d){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d)
                return i;
        }
        return -1;
    }
}
