import java.util.Scanner;

public class FactorsNegative {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the negative number: ");
        int number = inp.nextInt();
        System.out.print("The factors of the negative " + number + " are ");
        // Run the loop from -number to +number.
        for(int i = number; i <= Math.abs(number); i++) {

            //Skips the iteration for i = 0.
            if( i == 0) {
                continue;
            }
            else {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
