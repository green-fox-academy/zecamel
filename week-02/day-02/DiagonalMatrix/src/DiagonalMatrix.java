public class DiagonalMatrix {
    public static void main(String[] args) {

        int[][] a = new int[4][4];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    System.out.print("x");
                }else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
}
