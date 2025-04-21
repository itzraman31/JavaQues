
class GuessGame {
    static int pickedNumber = 42;

    public static int guess(int num) {
        if (num > pickedNumber) return -1;
        else if (num < pickedNumber) return 1;
        else return 0;
    }
}

public class GuessNumber extends GuessGame {
    public static int guessNumber(int n) {
        int s = 1;
        int e = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int ans1 = guess(mid);
            if (ans1 == 0) return mid;
            else if (ans1 == -1) e = mid - 1;
            else s = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println("Picked number: " + pickedNumber);
        System.out.println("Guessed number: " + guessNumber(n));
    }
}
