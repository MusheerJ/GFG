import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExtraElement {
    public static void main(String[] args) {
//
//        int N = 6;
//        int A[] = new int[]{
//                2, 4, 6, 8, 10, 11};
//        int B[] = new int[]{
//                2, 4, 6, 8, 10
//        };
        Set<Integer> s = new HashSet<>();
        s.add(4);
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(3);

        s.addAll(new ArrayList(Arrays.asList()));

        System.out.println(s);

//        System.out.println(optimal(A, B, N));
    }

    static public int optimal(int a[], int b[], int n) {

        /*
        Approach:To find the index of the missing element in less than linear time, binary search
        can be used, the idea is all the indices greater than or equal to the index of the missing
        element will have different elements in both the arrays and all the indices less than that
        index will have the similar elements in both arrays.
         */
        int l = 0;
        int r = n - 1;
        int m = 0;
        int index = n;

        while (l <= r) {
            m = (l + r) / 2;
            try {
                if (a[m] == b[m]) {
                    l = m + 1;
                } else {
                    index = m;
                    r = m - 1;

                }
            } catch (Exception e) {
                return n - 1;
            }

        }

        return index;
    }

    static public int findExtra(int a[], int b[], int n) {
        // add code here.
        int i = 0;
        try {
            while (a[i] == b[i]) {
                i++;
            }
        } catch (Exception c) {
            return n - 1;
        }


        return i;

    }
}
