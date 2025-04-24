public class MaxApiKey {

    public static void main(String[] args) {
        String currkey = "1010";
        String rotKey = "1100";

        int onecount = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < rotKey.length(); i++) {
            if (rotKey.charAt(i) == '1') {
                onecount++;
            }
        }

        int n = currkey.length();

        for (int i = 0; i < n; i++) {
            char c = currkey.charAt(i);

            if (c == '0') {
                if (onecount > 0) {
                    ans.append('1');
                    onecount--;
                } else {
                    ans.append('0');
                }
            } else {
                if (onecount > (n - i - 1)) {
                    ans.append('0');
                    onecount--;
                } else {
                    ans.append('1');
                }
            }
        }
        System.out.println(ans.toString());
    }
}
