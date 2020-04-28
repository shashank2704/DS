import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class File3
{
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("test2.txt"); 

BufferedReader br = new BufferedReader(fr);
int i ;
while((i=br.read())!=-1)
{
    System.out.print((char)i);
}
fr.close();
br.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}