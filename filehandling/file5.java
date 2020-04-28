import java.io.*;
public class file5
{
    public static void main(String[] args) {
      try
      {
           BufferedReader br = new BufferedReader(new FileReader("test.txt"));
           String s;
           int c=0;
           while((s=br.readLine())!=null)
           {
               c=c+1;
               System.out.println(s.charAt(3));
           }
           System.out.println(c);
      }
      catch(Exception e)  
      {
        System.out.print("file not found");
      }
           
       }
    }
