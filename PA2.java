import java.util.Scanner;
public class PA2 {
    public static void main(String[] args) {
        int Phy, Chem, Bio, Math ,Comp ;
        Scanner s = new Scanner(System.in);
        Phy = s.nextInt();
        Chem = s.nextInt();
        Bio = s.nextInt();
        Math = s.nextInt();
        Comp= s.nextInt();
        s.close();
        int sum = ((Phy+Chem+Comp+Bio+Math)/500)*100;
        if (Phy<0||Phy>100||Chem<0||Chem>100||Bio<0||Bio>100||Math<0||Math>100||Comp<0||Comp>100) 
            System.out.println( " input out of the bound\nExiting the program\n");
        else
            if (sum>=90) 
                System.out.println( " Grade : A \n");
            else if (sum>=80) 
                System.out.println( " Grade : B \n");
            else if (sum>=70) 
                System.out.println( " Grade : C \n");
            else if (sum>=60) 
                System.out.println( " Grade : D \n");
            else if (sum>=40) 
                System.out.println( " Grade : E \n");
            else if (sum<40) 
                System.out.println( sum+" Grade : F \n");       
    }
}