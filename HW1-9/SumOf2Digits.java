//Написать консольную программу, которая запрашивает у пользователя два числа, складывает их и результат выводит на консоль.
import java.util.Scanner;

public class SumOf2Digits {


    public static void main(String[] args) {
        Scanner calc = new Scanner (System.in);
        System.out.println("Please enter any two numbers, that You'd like to add together.");
        int a = calc.nextInt();
        int b = calc.nextInt();
        int c = Math.addExact(a,b);
        System.out.println(c);

    }

}
