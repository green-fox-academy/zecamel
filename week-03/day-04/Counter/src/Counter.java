// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {
    public static void main(String[] args) {
        System.out.println(Rec(7));

    }

    public static int Rec(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return Rec(n - 1);
        }
    }
}