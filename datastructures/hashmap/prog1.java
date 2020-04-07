import java.util.*;
public class prog1
{
    public static void main(String[] args) {
        HashMap<String,Integer> h1=new HashMap<>();
        h1.put("rehan",1);
            h1.put("shanky",2);
             h1.put("priya",3);
              h1.put("rituraj",2);
              System.out.println(h1.containsKey("shanky"));
      System.out.println(h1.containsValue(3));         
    }
}