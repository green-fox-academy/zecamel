public class Colors {
    public static void main(String[] args) {

        String[] colors0 = {"lime ", "forest green ", "olive ", "pale green ", "spring green "};
        String[] colors1 = {"orange red ", "red ", "tomato "};
        String[] colors2 = {"orchid ", "violet ", "pink ", "hot pink "};

        String[][] block = {colors0,colors1,colors2};
        for (int i = 0; i <block.length ; i++) {
            for (int j = 0; j < block[i].length ; j++) {
                System.out.print(block[i][j]);
            }
            System.out.println();
        }
    }
}
