import java.util.HashMap;

public class IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!mp.containsKey(s.charAt(i))) {
                if (mp.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    mp.put(s.charAt(i), t.charAt(i));
                }
            } else {
                if (mp.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) != t.charAt(i))
                return false;
        }
        System.out.println(mp);
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
