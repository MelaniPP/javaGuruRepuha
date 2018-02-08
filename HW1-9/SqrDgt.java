// ввозвести цифру из юзер импута во вторую степень
import java.util.Scanner;

import static java.lang.Math.*;

public class SqrDgt {

    public static void main(String[]args){
        Scanner qst = new Scanner(System.in);
        System.out.println("Please enter any digit you'd like to multiply by second degree");
        int a = (int) qst.nextDouble();
        System.out.print("The answer is "+ pow(a,2));

    }
}
