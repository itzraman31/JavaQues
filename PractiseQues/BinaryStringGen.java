import java.util.*;
public class BinaryStringGen {
    public static void solve(int len,StringBuilder s,ArrayList<String> ans){
        if(s.length()==len){
            ans.add(s.toString());
            return;
        }
        s.append("1");
        solve(len, s, ans);
        s.deleteCharAt(s.length()-1);

        s.append("0");
        solve(len, s, ans);
        s.deleteCharAt(s.length()-1);
    }
    public static void main(String[] args) {
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder s=new StringBuilder("");
        solve(3,s,ans);

        System.out.println();
        for(String str:ans){
            System.out.print(str+" ");
        }
    }    
}
