public class BitwiseComplement {
    public static int bitwiseComplement(int n) {
        if (n == 0) return 1;
        return (Integer.highestOneBit(n) << 1) - 1 ^ n;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }
}
