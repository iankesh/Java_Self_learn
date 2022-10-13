package learn;

class MyEmployees {
    private int id; // private access modifier
    private String name; // private access modifier
    private int salary;

    MyEmployees(int id, String name){ //constructor gets invoked directly when the object is created
        this.id = id;
        this.name = name;
    }
    MyEmployees(int id, String name, int salary){ //constructor overloading
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
//setter not required when there is constructor

//    void setId(int n) { //setter
//        id = n;
//    }
    int getId() { //getter
        return id;
    }
//    void setName(String a) { //setter
//        name = a;
//    }
    String getName() { //getter
        return name;
    }
    int getSalary(){
        return salary;
    }
}

public class constructor {
    public static void main(String[] args) {
        MyEmployees e1 = new MyEmployees(1,"Ankesh");
        System.out.println(e1.getName());
        System.out.println(e1.getId());

        MyEmployees e2 = new MyEmployees(2,"Smruti", 20000);
        System.out.println(e2.getName());
        System.out.println(e2.getId());
        System.out.println(e2.getSalary());
    }
}
