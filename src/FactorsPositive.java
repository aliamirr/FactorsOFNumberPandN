import java.util.Scanner;

public class FactorsPositive {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = inp.nextInt();
        System.out.print("The factors of the " + number + " are ");
        for (int i = 1; i <= number; ++i) {

            //If a number is divided by i
            // i is the factor
            if (number % i == 0) {
                System.out.print( i + " ");
            }
        }
    }
}