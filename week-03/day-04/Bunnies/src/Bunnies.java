// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies
// recursively (without loops or multiplication).

public class Bunnies {
    public static void main(String[] args) {

        int bunnies = 10;
        System.out.println(ears(bunnies));
    }

    public static int ears(int b){
        if(b == 0) {
            return 0;
        } else {
            return ears(b -1)  + 2;
        }
    }
}