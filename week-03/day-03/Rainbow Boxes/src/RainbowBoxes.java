import org.w3c.dom.css.RGBColor;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {

    public static void mainDraw(Graphics graphics) {

        drawing( 20, graphics ); // increase size and increase window size for epilepsy generator.

    }

        public static void drawing (int size, Graphics graphics){




            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                graphics.setColor( new Color( (int) (Math.random()*255),  (int) (Math.random()*255),  (int) (Math.random()*255)) );
                graphics.fillRect(i*WIDTH/size,j*HEIGHT/size, WIDTH/size,HEIGHT/size);

            }

        }

    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}