package learn;

public class method {
    public static void main (String[] args) {
        int x = 3;
        int y = 4;
        int z = sum(x,y);
        System.out.println(z);

        method obj = new method();
        int z2= obj.sum2(x,y);
        System.out.println(z2);

        print();

    }
    static int sum(int a, int b) { // static is only one, so we can directly use it.
        return a+b;
    }
    int sum2(int a, int b) { //not using static method, so we need to create object for this class.
        return 2*(a+b);
    }
    static void print() {
        System.out.println("Print");
    }
}
