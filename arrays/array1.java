import java.util.*;
public class array1
{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        for(int i=0;i<7;i++)
        {
            System.out.print(arr[i]+" ");
        }
        String str = Arrays.toString(arr);
        System.out.println(arr.length);
        System.out.println(str);
    }
}