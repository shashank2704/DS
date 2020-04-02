/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class insertion
{
    void insertionsort(int[] arr)
    {
        for (int i = 1; i <arr.length; i++) 
        { 
            int t=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>t)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=t;
        }
    }
    void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner s1= new Scanner(System.in);
        int n=s1.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s1.nextInt();
        }
       
        insertion obj=new insertion();
        obj.insertionsort(arr);
        obj.print(arr);
    }
}