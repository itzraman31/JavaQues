public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxlen = 0;
        int max = 0;

        for (int i : nums) {
            if (i == 1) {
                max++;
            } else {
                maxlen = Math.max(maxlen, max);
                max = 0;
            }
        }
        maxlen = Math.max(maxlen, max);

        return maxlen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
