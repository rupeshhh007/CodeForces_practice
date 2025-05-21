import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        boolean[] seen = new boolean[26];

        for (int i = 0; i < given.length(); i++) {
            char ch = given.charAt(i);
            seen[ch - 'a'] = true;
        }

        int unique = 0;
        for (int i = 0; i < 26; i++) {
            if (seen[i]) {
                unique++;
            }
        }

        if (unique % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
