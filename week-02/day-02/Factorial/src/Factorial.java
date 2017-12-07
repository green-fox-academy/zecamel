import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter your number 'ya cheeky bastard': ");

        Scanner input1 = new Scanner(System.in);
        int input2 = input1.nextInt();

        System.out.println(factorio(input2));

    }

    private static int factorio(int inputNumber) {

        int factorio = 1;

        for (int i = 2; i <= inputNumber; i++) {
            factorio = factorio * i;
        }
        return factorio;
    }


}
