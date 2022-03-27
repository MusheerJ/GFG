public class AlternateArray {

    public static void main(String[] args) {

        long[] arr = new long[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };

        rearrange(arr, arr.length);
    }

    public static void rearrange(long arr[], int n) {

        // Your code here

        long[] copy = new long[n];
        int half = n / 2;

        for (int i = 0; i < arr.length; i++) {

            copy[i] = arr[i];
        }

        for (int i = 0, j = n - 1; i < n && j >= half; i += 2, j--) {
            arr[i] = copy[j];
        }

        for (int i = 1, j = 0; i < n && j < half; i += 2, j++) {
            arr[i] = copy[j];
        }

        for (long a : arr) {
            System.out.print(a + " ");
        }

    }

}
