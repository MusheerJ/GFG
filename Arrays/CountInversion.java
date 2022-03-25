import java.lang.reflect.Member;
import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) {


        System.out.println(Merge(new int[]{3, 1, 4, 2}, 0, 3));
    }

    static int Merge(int arr[], int l, int r) {

        int count = 0;

        if (l < r) {
            int mid = (l + r) / 2;

            count += Merge(arr, l, mid);
            count += Merge(arr, mid + 1, r);
            count += MergeCount(arr, l, mid, r);

        }

        return count;
    }

    static int MergeCount(int arr[], int l, int m, int r) {
        int inversions = 0;

        int i = 0;
        int j = 0;
        int k = (int) l;
        int left[] = Arrays.copyOfRange(arr, l, m + 1);
        int right[] = Arrays.copyOfRange(arr, m + 1, r + 1);

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                inversions += (left.length - (i));
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
        return inversions;
    }
}