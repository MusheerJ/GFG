import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {

            int S = s.nextInt();
            int m = s.nextInt();
            System.out.println(countWays(S, m));
        }

    }

    static int countWays(int N, int m) {
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        int count[] = new int[N + 1];

        // base case
        count[0] = 1;

        // count ways for all values up
        // to 'N' and store the result
        for (int i = 1; i <= N; i++)
            for (int j = 0; j < arr.length; j++)

                // if i >= arr[j] then
                // accumulate count for value 'i' as
                // ways to form value 'i-arr[j]'
                if (i >= arr[j])
                    count[i] += count[i - arr[j]];

        // required number of ways
        return count[N];

    }
}