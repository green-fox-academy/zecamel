import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Enter your number to be divided: ");
        Scanner inputnum1 = new Scanner(System.in);
        int inputnum2 = inputnum1.nextInt();

        try {
            System.out.println((inputnum2 /0));
        } catch (Exception e){
            System.out.println("Cannot divide 0");
        }
    }
}
