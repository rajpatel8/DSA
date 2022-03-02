import java.util.Scanner;
public class PA1 {
    public static void main(String[] args) {
        int r ;
        Scanner s = new Scanner(System.in);
        r = s.nextInt();
        if (r%7==0) 
            System.out.println( r +" is divisible by 7 \n");
        else
            System.out.println( r +" is not divisible by 7 \n");
        s.close();
    }
}