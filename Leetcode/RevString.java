import java.util.*;

class RevString {
    public static void reverseString(char[] s) {
        int siz = s.length;
        int a = siz - 1;
        int b = 0;
        while (b < a) {
            char temp = s[b];
            s[b++] = s[a];
            s[a--] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] s = input.toCharArray();
        reverseString(s);
        System.out.println(new String(s));
    }
}
