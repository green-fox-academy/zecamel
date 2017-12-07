import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int input1 = input.nextInt();

        System.out.println("Please enter your second number: ");
        int input2 = input.nextInt();
        {

        }
        if (input2 <= input1) {
            System.out.println("The second number should be bigger! ");

        } else {
            for (int i = input1; i < input2; i++) {
                System.out.println(i);


            }

        }
    }
}
