public class TryWithoutImport {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // System.out.println("Enter your number: ");
        // int a=sc.nextInt();
        java.util.List<Integer> ans = new java.util.ArrayList<>();

        ans.add(4);
        ans.add(5);
        ans.add(2);
        
        java.util.Collections.sort(ans);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}