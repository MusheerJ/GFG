public class Segregate01 {
    public static void main(String[] args) {

    }

    void segregate0and1(int[] arr, int n) {
        // code here

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] == 1) {
                while (arr[right] != 0 && left < right) {
                    right--;
                }
                if (left >= right) {
                    break;
                }
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else {
                left++;
            }
        }
    }
}
