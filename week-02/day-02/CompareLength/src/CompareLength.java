public class CompareLength {
    public static void main(String[] args) {

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};

        if (p1.length > p2.length) {
            for (int i = 0; i <p1.length ; i++) {
                System.out.println(p1[i]);

            }
        }else {
            for (int i = 0; i <p2.length ; i++) {
                System.out.println(p2[i]);
            }

        }
    }
}