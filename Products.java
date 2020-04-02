/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Vinayak
 */
public class Products {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a[] = new int[]{2, 1, 5, 14};
        int check = 8;
        multiple(a, check);
    }
    static void multiple(int[] a, int check) {
        ArrayList<list> al = new ArrayList<>();
        int count = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                list obj = new list(a[i], a[j]);
                al.add(obj);
            }
        }
        int b[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            b[i] = al.get(i).a * al.get(i).b;
            b[i] = Math.abs(check - b[i]);
        }
        int min = b[0], pos = 0;
        for (int i = 0; i < b.length; i++) {
            if (min > b[i]) {
                min = b[i];
                pos = i;
            }
        }
        System.out.println(al.get(pos).a + " " + al.get(pos).b);
    }
}
class list {

    int a, b;

    list(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
