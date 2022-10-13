package learn;

class Employee {
    int id;
    String name;
    int salary;
    void display() {
        System.out.println("My ID is: "+ id);
        System.out.println("My name is: "+ name);
        System.out.println("My salary is: "+ getSalary());
    }
    int getSalary() {
        return salary;
    }
    String getName() {
        return name;
    }
    void setName(String n) {
        name = n;
    }
}
public class customClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Ankesh";
        e1.salary = 10000;
        e1.display();

        Employee e2 = new Employee();
        e2.salary = 20000;
        e2.name = "Smruti";
        System.out.println(e2.getSalary());
        System.out.println(e2.getName());
        e2.setName("Sakariya");
        System.out.println(e2.getName());
    }
}
