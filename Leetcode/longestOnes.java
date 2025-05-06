public class longestOnes {

    public static int longestOnes(int[] nums, int k) {
        int maxlen = 0;
        int l = 0;
        int currz = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                currz++;
            }

            if (currz > k) {
                while (l < nums.length && nums[l] == 1) {
                    l++;
                }
                l++;
                currz--;
            }

            maxlen = Math.max(maxlen, i - l + 1);
        }

        return maxlen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 0, 1};
        int k = 2;
        int result = longestOnes(nums, k);
        System.out.println("Maximum length of consecutive 1s (with at most " + k + " zeroes flipped): " + result);
    }
}
