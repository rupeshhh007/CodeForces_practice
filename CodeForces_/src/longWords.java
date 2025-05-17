import java.util.*;

public class longWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];


        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (word.length() > 10) {
                System.out.println(word.charAt(0) + "" + (word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
