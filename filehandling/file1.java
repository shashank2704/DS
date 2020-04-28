import java.io.FileInputStream;
import java.io.InputStream;

public class file1
{
   public static void main(String[] args) {
       try{
       InputStream s1 = new FileInputStream("test.txt");
       int i;
       while((i=s1.read())!=-1)
       {
           System.out.print((char)i);
       }
}

       
       catch(Exception e)
       {
        System.out.print(e.getMessage());
       }
   } 
}