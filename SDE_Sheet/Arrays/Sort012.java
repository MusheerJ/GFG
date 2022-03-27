public class Sort012 {
    public static void main(String[] args) {

        int a[] = new int[]{0, 0, 1, 1, 2};
        int n = a.length;
        // code here
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i : a) {
            if (i == 0) {
                zero++;
            } else if (i == 1) {
                one++;
            } else {
                two++;
            }
        }

        int insert = 0;
        while (insert < zero) {
            a[insert++] = 0;
        }
        while (insert < zero + one) {
            a[insert++] = 1;
        }
        while (insert < n) {
            a[insert++] = 2;
        }
    }
}
