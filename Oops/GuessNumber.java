import java.util.Scanner;

class Playgame {
    Scanner sc = new Scanner(System.in);
    int randomNum;
    int userNum;

    Playgame() {
        this.randomNum = (int) Math.floor(Math.random() * 10);
        inputuserNum();
    }

    void inputuserNum() {
        System.out.print("Enter your number: ");
        userNum = sc.nextInt();
    }

    boolean isCorrect() {
        if (this.userNum == this.randomNum)
            return true;
        if (this.userNum > this.randomNum) {
            System.out.println("Number is too large user num: "+userNum+" random num: "+randomNum);
        } else {
            System.out.println("Number is too small user num: "+userNum+" random num: "+randomNum);
        }
        return false;
    }
}

public class GuessNumber {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            count++;
            Playgame user1 = new Playgame();
            if (user1.isCorrect())
                break;
        }
        System.out.println("User win with " + count + " steps");
    }
}
