//Написать консольную программу, которая запрашивает у
// пользователя два целых числа и выводит на консоль наибольшее из них.
//Если числа равны то вывести на консоль текст "A == B".
import java.util.Scanner;

public class WhosBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two any numbers for further compresion ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
            System.out.print(a);

        }else if (b > a){
            System.out.println(b);
        }else System.out.println("A == B");
    }
}
