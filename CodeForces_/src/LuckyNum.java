import java.util.*;

public class LuckyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int luckyCount = 0;
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                luckyCount++;
            }
        }

        String countStr = Integer.toString(luckyCount);
        boolean flag = true;

        for (char c : countStr.toCharArray()) {
            if (c != '4' && c != '7') {
                flag = false;
                break;
            }
        }

        if (flag && luckyCount > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
