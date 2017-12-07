import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("Please enter your number: ");

        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= userInput1; i++) {
            sum = sum + i;


        }
        System.out.println(sum);
    }
}
