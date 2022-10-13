package learn;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;

public class method_overloading {
    public static void main(String[] args) {
        System.out.println("hello");
        int a = 20;
        System.out.println(num(a)); //number is sent to the method as reference, so it can not be changed
        System.out.println(a);

        int [] marks = {52, 54, 57, 59, 51};
        System.out.println(marks[0]);
        array(marks); // array is passed to the method as reference but its address(pointer) is passed so the elements of array can be updated.
        System.out.println(marks[0]);

        int p = 21;
        int q = 33;
        System.out.println(num(p, q)); //method overloading

        System.out.println(num("Dahan")); //method overloading

        num("Hello", "World");
    }

    static int num(int x) {
        x = 22;
        return x;
    }
    static int num(int x, int y){ // method overloading: having same name of methods with different parameters
        return x+y;
    }
    static String num(String s){ // method overloading: having same name of methods with different parameters
        return s;
    }
    static void num(String s, String t) { //method overloading can not happen changing the return type of methods, we must need to change the parameters
        System.out.println(s+ " " + t);
    }

    static void array(int[] arr) {
        arr[0] = 20;
    }

}
