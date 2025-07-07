public class BulbSwitch {
    public static int bulbSwitch(int n) {
        int d = (int) Math.sqrt(n);
        return d;
    }

    public static void main(String[] args) {
        int result = bulbSwitch(10);
        System.out.println(result);
    }
}
