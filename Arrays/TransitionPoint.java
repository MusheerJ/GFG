public class TransitionPoint {
    public static void main(String[] args) {

    }

    int transitionPoint(int arr[], int n) {
        // code here

        if (n == 1) {
            if (arr[n - 1] == 1) {
                return 0;
            } else {
                return -1;
            }
        }

        if (arr[0] == 1 && arr[1] == 1) {
            return 0;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                return i + 1;
            }
        }

        return -1;
    }

    int transitionPointOp(int arr[], int n) {
        // code here

        int l = 0;
        int r = n - 1;
        if (n - 1 == 0) {
            if (arr[0] == 1) {
                return 0;
            } else {
                return -1;
            }
        }
        if (arr[0] == 0 && arr[n - 1] == 0) {
            return -1;
        }
        if (arr[0] == 1 && arr[n - 1] == 1) {
            return 0;
        }

        return find(arr, l, r, n);
    }

    int find(int arr[], int l, int r, int n) {

        if (l < r) {
            int mid = (l + r) / 2;
            if ((arr[mid] == 0 && arr[mid + 1] == 1)) {
                return mid + 1;
            } else if (arr[mid] == 1 && arr[mid - 1] == 0) {
                return mid;
            } else if ((arr[mid] == 1 && arr[mid + 1] == 1)) {
                return find(arr, l, mid, n);
            } else {
                return find(arr, mid, r, n);
            }
        }
        return 0;
    }
}
