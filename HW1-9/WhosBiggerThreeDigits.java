//Написать консольную программу, которая запрашивает у пользователя три целых ч
// исла и выводит на консоль наибольшее из них.
//Если все числа равны то вывести на консоль текст "A == B == С".
import java.util.Scanner;

public class WhosBiggerThreeDigits{
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three any numbers for further compression ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = Math.max(Math.max(a,b),c);
    if (d > 0 || d < 0){
        System.out.println(d);

    }else System.out.println("A == B == C");


        }
}

