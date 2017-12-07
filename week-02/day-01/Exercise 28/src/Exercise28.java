import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        System.out.println("Please enter your number mf: ");
        int input2 = input1.nextInt();

        for (int i = 0; i<input2; i++) {
            for(int j = 0; j < i + 1; j ++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}