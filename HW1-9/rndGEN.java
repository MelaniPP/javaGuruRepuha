//Написать консольную программу, которая генерит 3 случайных числа в диапазоне от 0 до 100,
//выводит их на консоль и подсчитывает их сумму.
import java.util.Random;

public class rndGEN {


            public static void main(String[] args) {

                Random rndGen = new Random();
                int rndNumb = rndGen.nextInt(100);
                int rndNumbTwo = rndGen.nextInt(100);
                int rndNumbThree= rndGen.nextInt(100);
                int b = rndNumb+rndNumbTwo+rndNumbThree;
            System.out.println("Random # 1 is: "+rndNumb +" Random # 2 is :  "
                    +rndNumbTwo+ "Random # 3 is: "+rndNumbThree +" Sum is : "+b  );
        }
}
