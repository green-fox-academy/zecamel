import java.util.Scanner;

public class Exercise20 {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int input1 = input.nextInt();

        System.out.println("Please enter your second number: ");
        int input2 = input.nextInt();


        if (input1 > input2) {
            System.out.println("The bigger number is: " + input1);
        } else if (input1 < input2){
            System.out.println("The bigger number is: " + input2);
        } else {
            System.out.println("The two number are equal: " + input1);
        }
    }
}
