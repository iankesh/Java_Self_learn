package learn;

class Base{
    int x;

    int getX() {
        return x;
    }

    void setX(int x) {
        System.out.println("Setting x from base class");
        this.x = x;
    }
    void printBase(){
        System.out.println("From base class, x="+x);
    }

}
class Derived extends Base{
    int y;

    int getY() {
        return y;
    }

    void setY(int y) {
        System.out.println("Setting y from derived class");
        this.y = y;
    }
    void printDerived(){
        System.out.println("From Derived class, y="+y);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        b.printBase();

        Derived d = new Derived();
        d.setX(6);
        d.printBase();
        d.setY(66);
        d.printDerived();
    }
}
