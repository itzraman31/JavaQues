import java.util.*;

public class CorrectIp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ip Addr: ");
        String s = sc.nextLine();

        String strarr[] = s.split("\\.");

        s = "";
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].charAt(0) != '0') {
                s += strarr[i] + ".";
            } else {
                for (int j = 0; j < strarr[i].length(); j++) {
                    if (strarr[i].charAt(j) != '0') {
                        s += strarr[i].substring(j) + ".";
                        break;
                    }
                }
            }
        }
        System.out.println("Corrected Ip is: " + s);
    }
}
