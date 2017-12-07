// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {

        int base = 4;
        int power = 3;
        System.out.println(power(base,power));

    }
    public static int power(int x, int y){
        if(x == 0) {
            return 0;
        } else if(x == 0 || y == 0){
            return 1;
        } else {
            return power(x,y - 1) * x;
        }
    }
}
