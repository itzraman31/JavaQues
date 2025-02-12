import java.util.Scanner;

class MyAtoi {
    public static int myAtoi(String s) {
        long c = 0;
        s = s.trim();
        boolean isneg = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (isneg) {
                    if (-1 * c * 10 + s.charAt(i) - '0' <= Integer.MIN_VALUE)
                        return Integer.MIN_VALUE;
                } else {
                    if (c * 10 + s.charAt(i) - '0' >= Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;
                }
                c = c * 10 + s.charAt(i) - '0';
            } else if (s.charAt(i) == '-' && i == 0) {
                isneg = true;
            } else if (s.charAt(i) == '+' && i == 0) {
                continue;
            } else {
                if (isneg)
                    return (int) c * -1;
                return (int) c;
            }
        }
        if (isneg) {
            if (-1 * c <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            return (int) c * -1;
        }
        return (int) c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(myAtoi(s));
        sc.close();
    }
}
