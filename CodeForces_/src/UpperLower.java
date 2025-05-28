
import java.util.Scanner;
public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.nextLine();
        int lcount = 0;
        int ucount = 0;
        for (int i = 0; i < given.length(); i++) {
            if (Character.isUpperCase(given.charAt(i)))
                ucount++;

            else
                lcount++;


            if (ucount > lcount)
                given = given.toUpperCase();

            else
                given = given.toLowerCase();


            System.out.println(given);
        }

    }


}
