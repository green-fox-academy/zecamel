import java.util.Scanner;
public class Exercise15 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Please type distance in kilometers");

        int inputKm = userInput.nextInt();

        double inputMile = 0.62137119 * inputKm;

        System.out.println("Distance in miles: " + inputMile);
    }
}
