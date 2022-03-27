import javax.swing.plaf.IconUIResource;
import java.util.*;

public class UnionOfArr {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3, 4};


        ArrayList<Integer> c = findUnion(a, b, a.length, b.length);
        for (int i : c) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        Set<Integer> hs = new TreeSet<>();
        for (int a : arr1) {
            hs.add(a);
        }
        for (int a : arr2) {
            hs.add(a);
        }

        return new ArrayList(hs);

    }
}
