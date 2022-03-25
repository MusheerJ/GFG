import java.util.Arrays;

public class PeakElement {
    public static void main(String[] args) {

    }

    public int peakElement(int[] arr, int n) {
        //add code here.
        int l = 0;
        int r = n - 1;
        return find(arr, l, r, n);
    }

    public int find(int[] arr, int l, int r, int n) {

        int mid = (l + r) / 2;

        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        } else if (mid > 0 && arr[mid - 1] > arr[mid]) {
            return find(arr, l, mid - 1, n);
        } else {
            return find(arr, mid + 1, r, n);
        }

    }
}
