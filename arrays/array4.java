import java.util.*;
public class array4
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr1[][]=new int[3][4];
        int arr2[][]=new int[4][3];
        int m[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("multiplication :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m[i][j]=0;
                for(int k=0;k<4;k++)
                {
                    m[i][j]+= arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
    


}