import java.util.Scanner;

public class PA3 {

    public static void main(String[] args) {
        int sum = 0 ,n;
        Scanner s =new Scanner(System.in);
        n=s.nextInt();
        s.close();
        for (int i = 1 ; i <= n; i++) {
            if (i%2==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}