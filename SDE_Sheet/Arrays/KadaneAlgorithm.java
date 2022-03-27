public class KadaneAlgorithm {
    public static void main(String[] args) {

    }

    static public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int a : nums) {
            currSum += a;

            maxSum = Integer.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }

        }

        return maxSum;

    }
}
