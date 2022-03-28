import java.util.*;

public class OverlappingIntervals {
    public static void main(String[] args) {
        int[][] Intervals = new int[][] { { 6, 8 }, { 1, 9 }, { 2, 4 }, { 4, 7 } };

        int arr[][] = overlappedInterval(Intervals);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static public int[][] overlappedInterval(int[][] Intervals) {
        // Code here // Code here
        Stack<int[]> s = new Stack<>();
        Arrays.sort(Intervals, (a, b) -> {
            return a[0] - b[0];
        });

        for (int i = 0; i < Intervals.length; i++) {
            if (s.isEmpty()) {

                int a[] = new int[2];
                a[0] = Intervals[i][0];
                a[1] = Intervals[i][1];
                s.add(a);
            } else {
                int a[] = s.peek();
                if (a[1] >= Intervals[i][0]) {
                    a[0] = Integer.min(a[0], Intervals[i][0]);
                    a[1] = Integer.max(a[1], Intervals[i][1]);
                    s.pop();
                    s.add(a);
                } else {
                    int b[] = new int[2];
                    b[0] = Intervals[i][0];
                    b[1] = Intervals[i][1];
                    s.add(b);

                }

            }
        }

        int arr[][] = new int[s.size()][2];
        int l = 0;
        int k = 0;
        for (int[] is : s) {
            k = 0;
            for (int i : is) {
                arr[l][k] = i;
                k++;
            }
            l++;
        }

        return arr;

    }

}
