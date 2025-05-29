import java.util.ArrayList;
import java.util.Scanner;
public class Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers=new ArrayList<>();
        int num;
        int flag = 0;
        for(int i =0;i<n;i++){
            num = sc.nextInt();
            numbers.add(num);

        }

        for(Integer element:numbers){
            if(element==1){
                flag=1;
            }
        }

        if(flag==0){
            System.out.println("EASY");
        }
        else{
            System.out.println("HARD");
        }
    }
}
