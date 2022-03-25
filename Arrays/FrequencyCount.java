import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {

    }

    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        // 3 4 3 2 1 5
        // 1 1 2 1 1 0
        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        for (int i = 0; i < N; i++) {
            if (map.containsKey(i + 1)) {
                arr[i] = map.get(i + 1);
            } else {
                arr[i] = 0;
            }
        }

    }
}
