public class PA19 {
    public static void main(String[] args) {
        Person p = new Person();
        p.Name = "RAJ";
        /*p.age = "19"*/ //unable to access because it is private
    }
}

class Person {
    private String Age ;
    public String Name ;
}