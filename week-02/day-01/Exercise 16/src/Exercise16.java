import java.util.Scanner;
public class Exercise16 {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The seconf represents the number of pigs the farmer has
        // It should print how many legs all the animals have

        Scanner userInput1 = new Scanner (System.in);

        Scanner userInput2 = new Scanner (System.in);

        System.out.println("How many chickens do you have?");

        int inputChicken = userInput1.nextInt();

        System.out.println("How many pigs do you have?");

        int inputPig = userInput1.nextInt();

        int inputLegs = inputPig * 4 + inputChicken * 2;

        System.out.println("Total number of legs is: " + inputLegs);
    }
}
