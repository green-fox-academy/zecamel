import java.awt.*;
import java.util.Arrays;


public class Dice {

    static int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }


    public int[] getCurrent() {
        return dices;
    }


    public int getCurrent(int i) {
        return dices[i];
    }


    public static void reroll(Dice myDice) {
        for (int i = 0; i < myDice.dices.length; i++) {
            if ( myDice.dices[i] != 6) {
                myDice.dices[i] = (int) (Math.random() * 6) + 1;
            }
            System.out.println(Arrays.toString( myDice.dices ));
        }
    }


    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }


    public static void main(String[] args) {
        Dice myDice = new Dice();
        myDice.roll();
        while (!fuggveny(myDice.dices)) {
            reroll(myDice);
        }
        /*
        myDice.getCurrent();
        myDice.roll();
        myDice.getCurrent();
        myDice.getCurrent(5);
        myDice.reroll();
        myDice.getCurrent();
        myDice.reroll(4);
        myDice.getCurrent();
    */
    }


    public static boolean fuggveny(int [] stg) {
        for (int i = 0; i <stg.length ; i++) {
            if (stg[i] !=6){
                return false;
            }

        }
        return true;
    }
}