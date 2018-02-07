//Написать консольную программу, которая вычисляет
// дискриминант квадратного уравнения и выводит его на консоль.
import java.util.Scanner;

public class Discrimenanta_kvadratVirazh {
    public static void main(String[] args) {
        System.out.println("Please, eneter thtee values for furthere counting of discriminante : \n");
        Scanner dgts = new Scanner(System.in);
        int a = dgts.nextInt();
        int b = dgts.nextInt();
        int c = dgts.nextInt();
        double d = b*b-4*a*c;
        System.out.print("The value is: " + d*-1);
    }
}
