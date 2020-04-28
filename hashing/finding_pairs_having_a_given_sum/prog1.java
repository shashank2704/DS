import java.util.*;
public class prog1{    
    //hashing t.c.-O(n)
    public static boolean fun(int[] arr,int t)
    {
        HashSet<Integer> h1 =new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
                if(h1.contains(t-arr[i]))
                {
                    return true;
                }
                h1.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,5,2,3,9,15};
        int target=18;
       System.out.println(fun(arr,target));
    }
}