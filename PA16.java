import java.util.Scanner;

public class PA16 {
    public static void main(String[] args) {
        int r ;
        Scanner s = new Scanner(System.in);
        r=s.nextInt();
        s.close();
        circle c = new circle();
        c.circle(r);
        c.area();c.circum();
    }
}

class circle {
    private int r ;
    public void circle(int r) {
        this.r=r;
    }
    public void area() {
        System.out.println((Math.PI)*(Math.pow(r, 2)) + " m sq");
    }
    public void circum() {
        System.out.println(2*(Math.PI)*r +" m");
    }
}
