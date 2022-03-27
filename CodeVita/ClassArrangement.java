import java.util.Scanner;

public class ClassArrangement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        System.out.println(CountMinSwaps(s1));
    }

    static int CountMinSwaps(String s) {
        int N = s.length();
        int boys = 0;
        int girls = 0;

        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == 'B')
                boys++;
            else
                girls++;
        }

        // checking impossible condition
        if (boys > girls + 1 || girls > boys + 1)
            return -1;

        // odd length String
        if (N % 2 == 1) {

            // number of even positions
            int num = (N + 1) / 2;

            // stores number of girlses and
            // boyss at even positions
            int boys_even = 0, girls_even = 0;

            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    if (s.charAt(i) == 'B')
                        boys_even++;
                    else
                        girls_even++;
                }
            }

            if (boys > girls)
                return num - boys_even;

            else
                return num - girls_even;
        }

        // even length String
        else {

            // stores number of boyss at odd
            // and even position respectively
            int boys_odd = 0, boys_even = 0;

            for (int i = 0; i < N; i++) {
                if (s.charAt(i) == 'B') {
                    if (i % 2 == 1)
                        boys_odd++;

                    else
                        boys_even++;
                }
            }

            return Math.min(N / 2 - boys_odd, N / 2 - boys_even);
        }
    }
}
