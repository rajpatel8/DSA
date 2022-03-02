public class PA17 {
    public static void main(String[] args) {
        vehicle v = new vehicle(); 
        v.car1() ;
        System.out.println("\ncar1");
        v.display();v.car2();
        System.out.println("\ncar2");
        v.display();
    }
}
class vehicle {
    private String name, type, colour;
    private String price ;
    public void car1() {
        this.colour="red";
        this.type="convertible";
        this.name="Ferrari";
        this.price="$60,000.00";
    }
    public void car2() {
        this.colour="blue";
        this.type="van";
        this.name="Jump";
        this.price="$10,000.00";
    }
    public void display() {
        System.out.println("Colour :"+this.colour+"\nType :"+this.type+"\nName :"+this.name+"\nPrice :"+this.price);
    }

}
