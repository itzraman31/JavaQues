public class JumpGame {
    public boolean canJump(int[] nums) {
        int a = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > a) {
                return false;
            }
            a = Math.max(a, i + nums[i]);
            if (a >= nums.length - 1) {
                return true; 
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jumpGame.canJump(nums));
    }
}
