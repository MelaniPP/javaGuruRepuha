//Написать консольную программу, которая запрашивает у пользователя два числа.
//Если первое число меньше второго то при помощи цикла for
//вывести на консоль числа от первого до второго.

import java.util.Scanner;

public class SecondFor {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        if (a < b){
            for (a=a ; a<b+1 ; a++){
                System.out.println(a);
            }
        }
    }
}

