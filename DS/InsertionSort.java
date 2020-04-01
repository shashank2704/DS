/*
 * Alt + Shift + F to indent lines.
 */
package DataStructure;

public class InsertionSort {

    public static void main(String args[]) {
        int arr[] = new int[]{6,9,8,7};
        insertionSort(arr);
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int t = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > t) {
                System.err.println("*");
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = t;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
