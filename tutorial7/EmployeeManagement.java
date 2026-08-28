class Employee {
    String name, address;
    int age, mob;
    float sal;
    Employee(String name, String address, int age, int mob, float sal) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mob = mob;
        this.sal = sal;
    }
    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}
class Officer extends Employee {
    String spl;
    Officer(String name, String address, int age, int mob, float sal, String spl) {
        super(name, address, age, mob, sal);
        this.spl = spl;
    }
    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}
class Manager extends Employee {
    String dep;
    Manager(String name, String address, int age, int mob, float sal, String dep) {
        super(name, address, age, mob, sal);
        this.dep = dep;
    }
    void print_Dept() {
        System.out.println("Department: " + dep);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        Officer o = new Officer("Arun", "Kottayam", 30, 987654322, 50000, "Finance");
        Manager m = new Manager("Baisil", "Palai", 19, 987654321, 70000, "IT");
        System.out.println("Officer Details:");
        System.out.println("Name: " + o.name);
        System.out.println("Address: " + o.address);
        System.out.println("Age: " + o.age);
        System.out.println("Mobile: " + o.mob);
        o.print_Salary();
        o.print_Specialization();
        System.out.println("\nManager Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Address: " + m.address);
        System.out.println("Age: " + m.age);
        System.out.println("Mobile: " + m.mob);
        m.print_Salary();
        m.print_Dept();
    }
}
