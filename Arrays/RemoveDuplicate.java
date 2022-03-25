public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = new int[]{
                1, 2, 2, 3
        };

        int n = arr.length;

        for (int a : arr) {
            System.out.print(a + " ");
        }
        removeDuplicate(arr, n);
        System.out.println();
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }

    private static void removeDuplicate(int[] arr, int n) {
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[idx] != arr[i]) {
                idx++;
                arr[idx] = arr[i];
            }
        }

    }
}
