import java.awt.*;
import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();
        Flower yellowflower = new Flower(Color.yellow, 0);
        Flower blueflower = new Flower(Color.blue, 0);

        Tree bluetree = new Tree(Color.blue, 0);
        Tree orangetree = new Tree(Color.orange, 0);

        garden.addFlower(yellowflower);
        garden.addFlower(blueflower);
        garden.addTree(bluetree);
        garden.addTree(orangetree);

        showStatusFlower(yellowflower);
        showStatusFlower(blueflower);
        showStatusTree(bluetree);
        showStatusTree(orangetree);

        int watering1 = 40;
        System.out.println("Watering with " + watering1);
        yellowflower.water(watering1);
        blueflower.water(watering1);
        blueflower.water(watering1);
        orangetree.water(watering1);

        showStatusFlower(yellowflower);
        showStatusFlower(blueflower);
        showStatusTree(bluetree);
        showStatusTree(orangetree);
    }

    private static void showStatusFlower(Flower flower) {
        System.out.println("The " + (flower.getColor()) + " " + flower.getType() + " " + flower.isNeedWater());
    }

    private static void showStatusTree(Tree tree) {
        System.out.println("The " + (tree.getColor()) + " " + tree.getType() + " " + tree.isNeedWater());
    }
}