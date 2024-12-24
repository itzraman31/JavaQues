import java.util.*;

public class setquestion {
    public static void main(String[] args) {
        // Set<Integer> s=new HashSet<>();
        // Set<Integer> s=new LinkedHashSet<>();
        Set<Integer> s=new TreeSet<>();

        s.add(12);
        s.add(15);
        s.add(14);
        s.add(13);

        // s.remove(12);

        System.out.println(s);
    }
}
