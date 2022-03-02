import java.util.Scanner;
public class PA15 {
    public static void main(String[] args) {
        int l,b;
        Scanner s = new Scanner(System.in);
        l=s.nextInt();b=s.nextInt();s.close();
        rectangle r = new rectangle();
        r.rectangle(l, b);
        System.out.println(r.area()+" meter sq");
    }
}
 class rectangle {
     private int l,b;
    public void rectangle(int l, int b) {
        this.l=l;
        this.b=b;
    }    
    public float area(){
        return l*b;
    }
}