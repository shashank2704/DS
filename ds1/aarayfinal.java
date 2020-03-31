import java.util.*;
public class aarayfinal {
    public static <arraylist> void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        for(int i=0;i<5;i++)
        {
            l1.add(i);

        }
        for(int i=0;i<5;i++)
        {
            System.out.println(l1.get(i)+" ");
        }
        int j=0;
        while(j<5)
        {
            System.out.println(l1.get(j)+" ");
            j++;
        }
        for(int i:l1)
        {
            System.out.println(l1.get(i));
        }
    }
}
