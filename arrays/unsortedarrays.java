import java.util.*;
public class unsortedarrays
{
    public static void main(String[] args) {
        int arr1[]=new int[]{2,7,8,6,13};
        int arr2[]=new int[]{15,11,9,5};
int x=0;
int index=0;
        for(int i=0;i<arr1.length-1;i++)
        {
if(arr1[i]>arr1[i+1])
{
index=i+1;
x=arr1[i+1];
break;
}
        }
      
int arr3[]=new int[arr2.length];
int j=0;
for(int i=0;i<arr2.length;i++)
{
if(arr2[i]>arr1[index-1] && arr2[i]<arr1[index+1])
{
    arr3[j]=arr2[i];
}


j++;
}




int m=arr3[0];
for(int i=1;i<arr3.length;i++ )
{
  if(m<arr3[i])
  {
      m=arr3[i];
  }
}
System.out.println(m);
}

        
    
}