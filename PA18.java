import java.util.Scanner;

public class PA18 {
    public static void main(String[] args) {
        String str ;Employee e=new Employee();int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Insert your Name :");
        str = s.nextLine();
        e.setName(str);
        System.out.println("Insert your Designation :");
        str = s.nextLine();
        e.setDepartment(str);
        System.out.println("Insert your department name :");
        str = s.nextLine();
        e.setDepartment(str);
        while(true){
        System.out.println("To create new attribute date of joining\nPress 1");
        n=s.nextInt();
        if (n==1) {
            System.out.println("The attribute has been created :\n enter the value to be stored:\n");
            str=s.nextLine();
            e.create_attribute(str);
            break;
        }
        else{System.out.println("Please enter a valid input next time :");}}
        str = e.getName();
        System.out.println("Name :"+ str);
        System.out.println("Deleting the attribute designation");
        e.setDesignation(null);

    }
}

class Employee {
    private String name, designation, department;

    public void create_attribute(String str)
    {
        String date_of_joining = str;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
}