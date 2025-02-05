import java.util.*;

public class Pallindrome {
    public static boolean solve(String s,int ind){
        if(ind>=s.length()/2){
            return true;
        }
        if(s.charAt(ind)!=s.charAt(s.length()-ind-1)) return false;
        ind+=1;
        if(solve(s, ind)==false) return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string: ");
        String s=sc.nextLine();

        System.out.println(solve(s,0));
    }    
}
