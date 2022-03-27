import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {

        ArrayList<Long> a = nthRowOfPascalTriangle(3);

        for (long i : a) {
            System.out.print(i + " ");
        }

    }

    static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here

        List<List<Long>> triangle = generate(n);

        return (ArrayList<Long>) triangle.get(n - 1);
    }

    static public List<List<Long>> generate(int n) {

        List<List<Long>> triangle = new ArrayList<>();
        ArrayList<Long> a = new ArrayList<>();
        a.add((long) 1);
        triangle.add(a);

        for (int i = 1; i < n; i++) {
            ArrayList<Long> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    arr.add((long) 1);
                } else if (j == i) {
                    arr.add((long) 1);
                } else {
                    arr.add((triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j)));
                }
            }
            triangle.add(arr);
            // a.clear();
        }
        return triangle;
    }

    public List<List<Integer>> generate(int numRows, int b) {

        List<List<Integer>> triangle = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        triangle.add(a);

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    arr.add(1);
                } else if (j == i) {
                    arr.add(1);
                } else {
                    arr.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(arr);
            // a.clear();
        }
        return triangle;

    }

}
