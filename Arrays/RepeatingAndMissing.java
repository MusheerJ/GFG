import java.util.Arrays;

public class RepeatingAndMissing {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 3, 2, 4, 4 };

        int abs_val = Math.abs(-1);
        System.out.println(abs_val);
        // printTwoElements(arr, arr.length);

    }

    static void printTwoElements(int arr[], int size) {
        int i;
        System.out.print("The repeating element is ");

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }

        System.out.print("And the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                System.out.println(i + 1);
        }
    }

    static int[] findTwoElement(int arr[], int n) {
        // code here

        int[] result = new int[n];
        int[] ans = new int[2];

        for (int i = 0; i < n; i++) {
            if (result[arr[i] - 1] == -1) {
                ans[0] = arr[i];
                continue;
            } else {
                result[arr[i] - 1] = -1;
            }

        }

        for (int i = 0; i < n; i++) {
            if (result[i] != -1) {
                ans[1] = i + 1;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return ans;

    }

}
