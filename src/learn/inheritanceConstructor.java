package learn;

import java.sql.SQLOutput;

class A {
    A() {
        System.out.println("Constructor from Class A");
    }
    A(int x){
        System.out.println("Overloaded constructor from class A"); //derived class will by default only call the non-parametrized constructor
    }
}
class B extends A {
    B() {
        super(2); // to call the specific constructor from superclass
        System.out.println("Constructor from Class B");
    }
    B(int x, int y) {
        System.out.println("Overloaded constructor from class B");
    }
}

public class inheritanceConstructor {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B(); // class B will also trigger class A constructor by default
        B b2 = new B(4,5); //this will call the overloaded constructor
    }
}
