import java.util.Scanner;
public class PA13 {
    public static double hp(double n)
    {
        if(n==1){return 1.0;}
        else{ return ((1/n)+ hp((n-1)));}
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
