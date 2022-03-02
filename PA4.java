import java.util.Scanner;

public class PA4 {
    public static void main(String[] args) {
        int n ;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        s.close();
        for (int i = 1; i <=10; i++) {
            System.out.println(n +" × " + i +" = "+n*i);
        }
    }
}
