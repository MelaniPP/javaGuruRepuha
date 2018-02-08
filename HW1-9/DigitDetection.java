import java.util.Scanner;

public class DigitDetection {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any absalute number: ");
        int a = scn.nextInt();
        if(a < 0 ){
            System.out.println("Число отрицательное");
        }else if (a == 0){
            System.out.println("Число равно 0");
        }else System.out.println("Число положительное");
    }
}
