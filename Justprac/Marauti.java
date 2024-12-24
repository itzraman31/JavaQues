import java.util.*;

public class Marauti{

    public static  boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> mp = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            if(mp.containsKey(sch)){
                if(mp.get(sch) != tch){
                    return false;
                }
                else {
                    if(mp.containsValue(tch)){
                    return false;
                    }
                    mp.put(sch,tch);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "a b c d a";
        String t = "v w x y z";

        if(isIsomorphic(s,t)){
            System.out.println("yes");
        }
        else{
            System.out.println("not");
        }
    }
}