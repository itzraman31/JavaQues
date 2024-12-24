package Strings;
import java.util.Scanner;

public class Chararray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your string: ");
            String s=sc.nextLine();

            char[] ch=s.toCharArray();
            // StringBuilder str=new StringBuilder("   hello world  ");
            // str=s;
            String[] ch1=s.split(" ");

            String res=s.trim();
            System.out.println(res);
            // for(int i=0; i<ch1.length; i++)
            // {
            //     System.out.println(ch1[i]);
            // }
        }
    }
}
