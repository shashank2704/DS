/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class bubble
{
    public static void main(String args[])
    {
        Scanner s1= new Scanner(System.in);
        int n=s1.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }
        bubbleSort(arr);
    }
    static void bubbleSort(int arr[])
    {
        boolean flag=true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag=false;
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
                
            }
            
        }
        if(flag)
        {
            System.out.println("Already Sorted");
            
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}