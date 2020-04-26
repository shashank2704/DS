import java.util.*;
public class array3
{
    public static void main(String[] args) {
        int arr1[]=new int[4];
        int arr2[]=new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
arr1[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
arr2[i]=sc.nextInt();
        }
        System.out.println("duplicate elements are :");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.print(arr1[i]+ " ");
                }
            }
        }



    }
}