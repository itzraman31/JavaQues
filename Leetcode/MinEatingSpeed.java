import java.util.*;

public class MinEatingSpeed {
    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int min = r;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int count = 0;
            for (int i : piles) {
                count += Math.ceil((double) i / mid);
            }
            if (count <= h) {
                min = Math.min(min, mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int result = minEatingSpeed(piles, h);
        System.out.println(result);
    }
}
