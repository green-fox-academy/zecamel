public class Exercise13 {
    public static void main (String [] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        System.out.println((24-currentHours)*60*60-(60-currentMinutes)*60+ currentSeconds);
    }
}
