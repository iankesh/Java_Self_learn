package learn;

import java.util.Random;
import java.util.Scanner;

class guessTheNumber {
    int n;
    int r;
    guessTheNumber(int n, int r) {
        this.n = n;
        this.r = r;
    }
    int checkNumber(){
        if (r == n) {
            System.out.println("Congratulations, You have found the number!");
            return 1;
        }
        else if (r < n) {
            System.out.println("Go smaller");
            return 0;
        }
        else {
            System.out.println("Go Bigger");
            return 0;
        }
    }
}

public class guessTheNumberGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(100);
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);

        int x = 0;
        while(x == 0){
            int input = sc.nextInt();
            guessTheNumber g1 = new guessTheNumber(input, randomNumber);
            x = g1.checkNumber();
        }
        System.out.println("Random Number = "+randomNumber);
    }
}
