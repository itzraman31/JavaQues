import java.util.*;

class TrapWater {
    public static int trap(int[] height) {
        int size = height.length;
        int i, j, k, sum = 0, a, b;

        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        List<Integer> v3 = new ArrayList<>();

        if (size == 1) {
            return 0;
        }

        a = 0;
        b = 1;
        j = 0;
        int minele = Integer.MIN_VALUE;
        for (i = 0; i < size; i++) {
            if (height[i] > minele) {
                minele = height[i];
                v3.add(i);
            }
        }
        v3.add(size);
        int f = 0, d = 0;
        while (f < size) {
            for (i = v3.get(d); i < v3.get(d + 1); i++) {
                v1.add(height[v3.get(d)]);
            }
            f = i;
            d++;
        }

        a = size - 1;
        b = size - 1;
        v2.add(height[size - 1]);
        while (b >= 0) {
            if (height[a] > height[b]) {
                v2.add(height[a]);
            } else {
                v2.add(height[b]);
                a = b;
            }
            b--;
            j++;
        }
        Collections.reverse(v2);

        for (i = 0; i < size; i++) {
            int minEle = Math.min(v1.get(i), v2.get(i));
            int ans = minEle - height[i];
            sum += ans;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
