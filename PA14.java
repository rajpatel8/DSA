import java.util.Scanner;
public class PA14 {
    public static double hp(double n)
    {
        if(n==1){return 1.0;}
        else{ return ((1/Math.pow(2, n-1))+ hp((n-1)));}
    }
    public static void main(String[] args) {
        double n ;  
        Scanner s = new Scanner(System.in);
        n=s.nextDouble();
        s.close();
        double a = hp(n);
        System.out.println(a);
    }
}
