import java.util.Scanner;

public class PA5 {
    public static void main(String[] args) {
        int n ;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        int v = n ;
        s.close();
        int l = String.valueOf(n).length();
        int sum =0,dig;
        while (n!=0) {
            dig = n%10 ;
            sum+=Math.pow(dig, l);
            n/=10;
        }
        if (sum==v) 
            System.out.println(v + " is Armstrong number");
        else
            System.out.println(v + " is not an Armstrong number");
    }
}