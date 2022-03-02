import java.util.Scanner;
public class PA10 {
    public static void main(String[] args) {
        String s,s1 = "" ;
        Scanner S = new Scanner(System.in) ;
        s = S.nextLine();
        S.close();
        for (int i=(s.length()-1); i>=0; --i)
        { s1 += s.charAt(i);}
        if (s1.toLowerCase().equals(s.toLowerCase())){
          System.out.println("True");}
        else{System.out.println("False");}
    }
}