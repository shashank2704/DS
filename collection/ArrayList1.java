import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        ArrayList<ArrayList> arr=new ArrayList<ArrayList>();
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        ArrayList<Integer> arr2=new ArrayList<Integer>();
        ArrayList<Integer> arr3=new ArrayList<Integer>();
        ArrayList<Integer> arr4=new ArrayList<Integer>();
        ArrayList<Integer> arr5=new ArrayList<Integer>();
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);
        arr.add(arr4);
        arr.add(arr5);
        arr1.add(2);
        arr1.add(4);
        arr2.add(1);
        arr2.add(4);
        arr2.add(5);
        arr2.add(3);
        arr3.add(2);
        arr3.add(5);
        arr4.add(1);
        arr4.add(5);
        arr4.add(2);
        arr5.add(4);
        arr5.add(2);
        arr5.add(3);
        int ind=s1.nextInt();
        System.out.println(arr.get(ind-1));
        
    }
}