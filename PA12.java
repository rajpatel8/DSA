import java.util.Scanner;
public class PA12 {
    public static int fac (int a)
    {if (a==0) {return 1 ;}
        else{return fac(a-1)*a ;}}
        public static void main(String[] args) {
        int a ;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        s.close();
        System.out.println(fac(a));}}
