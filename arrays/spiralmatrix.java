import java.util.*;
public class spiralmatrix
{
   static void fun(int a[][] , int m,int n)
    {
int t,b,l,r,dir;
dir=0;
t=0;
b=m-1;
l=0;
r=n-1;
while(t<=b && l<=r)
{
    if(dir==0)
    {
        for(int i=l;i<=r;i++)
        {
            System.out.print(a[t][i]+" ");
        }
        t++;
        dir=1;
    }
    else
    if(dir==1)
    {
        for(int i=t;i<=b;i++)
        {
            System.out.print(a[i][r]+" ");
        }
        r--;
        dir=2;
    }
    else
    if(dir==2)
    {
        for(int i=r;i>=l;i--)
        {
            System.out.print(a[b][i]+" ");
        }
        b--;
        dir=3;
    }
    else
    if(dir==3)
    {
        for(int i=b;i>=t;i--)
        {
            System.out.print(a[i][l]+" ");
        }
        l++;
        dir=0;
    }
}


    }
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       
        fun(arr,3,3);
    }
}
