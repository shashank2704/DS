/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class prog1 {
    public static void fun(char arr[])
    {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i])==true)
            {
                int val=mp.get(arr[i]);
                mp.put(arr[i],val+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
           if(mp.get(arr[i])==1)
           {
               flag=1;
               System.out.println(arr[i]);
               break;
           }
        }
         if(flag==0)
           {
                System.out.println("-1");
           }
        
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	    int x=sc.nextInt();
	    sc.nextLine();
	    String str=sc.nextLine();
	    char []arr=str.toCharArray();
	   fun(arr);
	}
	}
}