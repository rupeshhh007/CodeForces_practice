import java.util.*;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        while (true) {
            year++;
            if (hasAllUniqueDigits(year)) {
                System.out.println(year);
                break;
            }
        }
    }

    public static boolean hasAllUniqueDigits(int year) {
        String str = Integer.toString(year);
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }

        return true;
    }
}
