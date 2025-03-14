import java.util.*;

class IsPalindrome {
    public static boolean isPalindrome(int x) {
        long sum = 0;
        for (int i = x; i > 0; i = i / 10) {
            sum = sum * 10 + i % 10;
        }
        return sum == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isPalindrome(input));
        sc.close();
    }
}
