import java.util.ArrayList;
        import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        orderzedominoes(dominoes);
        System.out.println("Ze ordered dominoes:" + orderzedominoes(dominoes));
    }

    private static List<Domino> orderzedominoes(List<Domino> zedominolist) {
        for (int i = 0; i < zedominolist.size(); i++) {
            for (int j = i; j < zedominolist.size(); j++) {
                if (zedominolist.get(i).getValues()[1] == zedominolist.get(j).getValues()[0]) {
                    zedominolist.add(i+1, zedominolist.get(j));
                    zedominolist.remove(j+1);
                }
            }
        }
        return zedominolist;
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}