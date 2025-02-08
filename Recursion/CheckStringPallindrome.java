public class CheckStringPallindrome {
    public static boolean solve(String s,int ind){
        if(ind>=(s.length())/2) return true;

        if(s.charAt(ind)!=s.charAt(s.length()-ind-1)) return false;
        if(solve(s, ind+1)==false) return false;

        return true;
    }
    public static void main(String[] args) {
        String s="heloeh";

        System.out.print(solve(s,0));
    }
}
