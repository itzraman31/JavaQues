import java.util.*;

class ReverseInt {
    public static int reverse(int x) {
        int d = 0;
        while (x != 0) {
            int c = x % 10;
            if (d > Integer.MAX_VALUE / 10 || d < Integer.MIN_VALUE / 10) {
                return 0;
            }
            d = (d * 10) + c;
            x = x / 10;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
        sc.close();
    }
}
