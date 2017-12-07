import java.util.Scanner;

public class Exercise19 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int inputNum = input.nextInt();

        if (inputNum <= 0) {
        System.out.println("Not enough");
        } else if (inputNum == 1) {
            System.out.println("One");
        } else if (inputNum == 2) {
            System.out.println("Two");
        } else if (inputNum > 2) {
            System.out.println("A lot");

        }
    }
}
