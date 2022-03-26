import java.util.zip.CheckedOutputStream;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 2, 3, 1, 3};
        System.out.println(majorityElement(arr, arr.length));
    }

    static int majorityElement(int[] a, int size) {

        int elem = findCand(a, size);
        return isMajority(a, size, elem);
    }

    private static int isMajority(int[] a, int size, int elem) {

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] == elem) {
                count++;
            }

        }

        if (count > (size / 2)) {
            return elem;
        } else
            return -1;
    }


    // return candidate for majority element
    private static int findCand(int[] a, int size) {

        int count = 1;
        int maj_ind = 0;

        for (int i = 1; i < size; i++) {
            if (a[maj_ind] == a[i]) {
                count++;
            } else count--;
            if (count == 0) {
                maj_ind = i;
                count = 1;
            }
        }
        return a[maj_ind];
    }
}
