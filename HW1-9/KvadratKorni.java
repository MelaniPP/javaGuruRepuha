//
import java.util.Scanner;

public class KvadratKorni {


        public static void main(String[] args) {
            System.out.println("Please, eneter thtee values for furthere counting of discriminante : \n");
            Scanner dgts = new Scanner(System.in);
            int a = (int)dgts.nextDouble();
            int b = (int)dgts.nextDouble();
            int c = (int)dgts.nextDouble();
            double d = b*b-4*a*c;
            if (d > 0){
            System.out.print(Math.sqrt(a));
                System.out.print(Math.sqrt(b));
                System.out.print(Math.sqrt(c));

            }
            else
                System.out.print("корней на множестве действительных чисел нет");
        }
    }



