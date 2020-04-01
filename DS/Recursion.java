/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;
import java.util.*;
/**
 *
 * @author Vinayak
 */

public class Recursion {
    static int b=0,c=0;
    static void fb(int a){
        if(a!=0 && b==0 && c==0){
            System.out.println(b+c);
            c++;
            System.out.println(c);
            a--;
            fb(a);
        }

        else if(a!=0 && c!=0){
            System.out.println(b+c);
            int d=b;
            b=c;
            c+=d;
            a--;
            fb(a);
        }
    }
    public static void main(String[] args) {
        fb(7);
    }
}
