import java.util.Scanner;

public class Exercise21 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of girls: ");
        int input1 = input.nextInt();

        System.out.println("Please enter the number of boys: ");
        int input2 = input.nextInt();

        int input3 = input1 + input2;

        if (input1 == input2 && input3 > 20) {
            System.out.println("Excellent party");

        } else if (input1 != input2 && input3 > 20 && input1>0) {
            System.out.println("Good party");

        } else if (input3 <= 20 && input1>0) {
            System.out.println("Average party");

        } else if (input1 == 0) {
            System.out.println("Sausage party");

        }
    }
}
