import java.util.Scanner;
public class Weights {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b=sc.nextInt();
        int count = 0;
        while(true){
            if(a>b){
                break;
            }

            else {
                a*=3;
                b*=2;
                count++;
            }

        }
        System.out.println(count);
    }

}
