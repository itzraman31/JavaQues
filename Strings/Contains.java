import java.util.*;

public class Contains {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your Main String: ");

        StringBuilder str=new StringBuilder("hellow rldd");
        String s=sc.nextLine();
        
        System.out.println();
        
        System.out.print("Enter name to search: ");
        String name=sc.nextLine();
        
        String ch[]=s.split(" ");
        System.out.println();

        for(int i=0; i<ch.length; i++)
        {
            if(ch[i].equals(name))
            {
                System.out.println("Matched");
            }
        }
    }
}
