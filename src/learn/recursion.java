package learn;

public class recursion {
    public static void main(String[] args) {
        int a = 4;
        System.out.println("The factorial of "+ a + " is: "+ factorial(a));
        System.out.println("The factorial of "+ a + " is: "+ factorialFor(a));
    }
    static int factorial(int n) {
        if (n==0 || n==1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    static int factorialFor(int n) {
        int fact = 1;
        if (n==0 || n==1) {
            return 1;
        }
        else {
            for (int i=1; i<=n; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }
}
