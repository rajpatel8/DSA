import java.util.Scanner;

public class PA9 {
    public static void main(String[] args) {
        int n,r,v,dig_count=0 ;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        s.close();
        v=n;r=n;
        while (n!=0) {
            n/=10;
            dig_count++;}
        int dig=0,sum=0;
        while (v!=0){
            dig = v%10;
            sum += (int) Math.pow(dig, dig_count);
            dig_count--;
            v/=10;}
        if (r==sum) 
            System.out.println(r+" is Disarium number");
        else
            System.out.println(r+" is not Disarium number");

    }
}
