public class MaxApiKey {

    public static void main(String[] args) {
        String currkey = "1100";
        String rotKey = "1000";

        int zcount = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < rotKey.length(); i++) {
            if (rotKey.charAt(i) == '1') {
                zcount++;
            }
        }
        int j = 0;
        for (int i = currkey.length() - 1; i >= 0; i--) {
            if (currkey.charAt(j) == '0') {
                if (zcount > 0) {
                    ans.append('1');
                    zcount--;
                } else {
                    ans.append(currkey.charAt(j));
                }
            } else {
                if (zcount > i) {
                    if (currkey.charAt(j) == '0') {
                        ans.append('1');
                        zcount--;
                    } else {
                        ans.append('0');
                        zcount--;
                    }
                } else {
                    ans.append(currkey.charAt(j));
                }
            }
            j++;
        }
        System.out.println(ans);
    }
}
