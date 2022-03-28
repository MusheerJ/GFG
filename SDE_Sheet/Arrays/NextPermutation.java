import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 6, 5, 4 };
        int n = arr.length;
        List<Integer> a = nextPermutation(n, arr);

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static List<Integer> nextPermutation(int n, int arr[]) {

        List<Integer> next = new ArrayList<>();

        int i = n - 2;

        int j = n - 1;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            while (arr[i] >= arr[j]) {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        Arrays.sort(arr, i + 1, n);

        for (int a : arr) {
            next.add(a);
        }

        return next;
    }
}
