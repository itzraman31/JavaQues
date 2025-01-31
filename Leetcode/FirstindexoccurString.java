class FirstindexoccurString {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;
        int i = 0;
        int f = 0;
        int j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                f++;
                i = f;
                j = 0;
            }
            if (j == needle.length()) return f;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("abcdef", "de"));
        System.out.println(strStr("aaaaa", "bba"));
    }
}
