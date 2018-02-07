//program that compress 3 digits from User input.
import java.util.Scanner;

import static java.lang.Math.*;

public class MaxOfThree {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 3 digits for  further compression, bitch");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int max = Math.max(Math.max(a,b),c);
        System.out.println(a + " " + b + " " + c);
        System.out.println("The max of three is: " + max);
    }
}
