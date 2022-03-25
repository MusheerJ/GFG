import java.util.Arrays;

public class RotateArrayAnti {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr(arr, d, arr.length);
    }

    static void rotateArr(int arr[], int d, int n) {
        // add your code here

        int arr1[] = Arrays.copyOf(arr, n);
        for (int a : arr) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < n; i++) {
            int newin = i - d;
            if (newin < 0) {
                newin = newin + n;
            }
            arr[newin] = arr1[i];
        }
        System.out.println();
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
