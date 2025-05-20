import java.util.*;

public class TotalFruit {
    public static int totalFruit(int[] fruits) {
        int k = 2;
        Map<Integer, Integer> mp = new HashMap<>();
        int maxlen = 0;
        int n = fruits.length;
        int p = 0;
        int i = 0;

        while (i < n) {
            mp.put(fruits[i], mp.getOrDefault(fruits[i], 0) + 1);

            while (mp.size() > k) {
                mp.put(fruits[p], mp.get(fruits[p]) - 1);
                if (mp.get(fruits[p]) == 0) {
                    mp.remove(fruits[p]);
                }
                p++;
            }

            maxlen = Math.max(maxlen, i - p + 1);
            i++;
        }

        return maxlen;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println(totalFruit(fruits));
    }
}
