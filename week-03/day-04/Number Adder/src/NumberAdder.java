// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.


public class NumberAdder {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(adder(n));

    }

    public static int adder(int n) {
        if (n == 0) {
            return 0;
        } else {
            return adder(n - 1)+n;
        }
    }
}