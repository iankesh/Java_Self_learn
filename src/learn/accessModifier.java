package learn;

class Employees {
    private int id; // private access modifier
    private String name; // private access modifier

    void setId(int n) { //setter
        id = n;
    }
    int getId() { //getter
        return id;
    }
    void setName(String a) { //setter
        name = a;
    }
    String getName() { //getter
        return name;
    }
}

public class accessModifier {
    public static void main(String[] args) {
        Employees e1 = new Employees();
        e1.setName("Ankesh");
        System.out.println(e1.getName());
        e1.setId(1);
        System.out.println(e1.getId());

    }
}
