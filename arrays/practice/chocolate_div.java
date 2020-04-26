import java.util.*;
public class chocolate_div
{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int d=sc.nextInt();
        int m=sc.nextInt();
        int s=0;

        for(int i=m-1;i<n;i++)
        {
for(int j=i-m+1;j<=i;j++)
{
s=s+arr[j];

}

if(s==d)
{
    for(int j=i-m+1;j<=i;j++)
{
System.out.print(arr[j]+" ");

}
System.out.println();
}
s=0;
        }

    }
}