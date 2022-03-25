import java.util.HashSet;

public class FirstRepeating {
    public static void main(String[] args) {

    }

    public static int firstRepeated(int[] arr, int n) {
        int min = -1;
        HashSet<Integer> set = new HashSet<>();

        //set is used to find if the number is repeating;
        // start from last to find the repeating number with min index
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                min = i;
            else
                set.add(arr[i]);
        }
        if (min != -1)
            return min + 1;
        else
            return min;
    }
}
