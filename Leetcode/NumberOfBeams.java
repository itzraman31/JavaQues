class NumberOfBeams {
    public static int solve(String bank[]) {
        int a = 0, b = 0;
        int row = bank.length;
        int col = bank[0].length();
        int st = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') a++;
            }
            if (a != 0) {
                st = i;
                break;
            }
        }
        int tot = 0;
        for (int i = st + 1; i < row; i++) {
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') b++;
            }
            if (b != 0) {
                tot += a * b;
                a = b;
                b = 0;
            }
        }
        return tot;
    }
    public static int numberOfBeams(String[] bank) {
        return solve(bank);
    }
    public static void main(String[] args) {
        String[] bank = {"011001", "000000", "010100", "001000"};
        System.out.println(numberOfBeams(bank));
    }
}
