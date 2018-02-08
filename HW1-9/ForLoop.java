//Написать консольную программу, которая запрашивает
//у пользователя два целых числа и если певое число
//меньше второго то программа выводит на консоль
//все чётные числа от первого до второго числа.

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner dgt = new Scanner(System.in);
        System.out.println("Enter any two digits");
       int a = dgt.nextInt();
       int b = dgt.nextInt();
       if (a < b){
        for (int i=1; i<=b; i++)
        {
            if (i%2 !=0)
                System.out.print(i + " " );
            else
        //   if (i%10 ==0) вопрос религии
                System.out.println("Выключаем компьютер");
        }
    }
    }
}
