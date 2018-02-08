import java.util.Random;

//генерим 3 числа. и вывести в консоль их и сумму из них.
public class RandomDigitSum {
 /*   public static void main(String[] args) {
        int value = ThreadLocalRandom.current().nextInt(0, 101);
        int value2 = ThreadLocalRandom.current().nextInt(0, 101);
        int value3 = ThreadLocalRandom.current().nextInt(0, 101);
        int c = value+value2+value3;
        System.out.println("Value#1 is "+value+" Value#2 is "+value2+" Value#3 is "+value3+" Sum of values is "+c);

    } */

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
