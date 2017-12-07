import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBoxes {

    public static void mainDraw(Graphics graphics){
        // draw a box that has different colored lines on each edge.
        graphics.setColor( Color.red );
        graphics.drawLine( 0 ,0 , WIDTH, 0);

        graphics.setColor( Color.yellow );
        graphics.drawLine( WIDTH,0, WIDTH, HEIGHT );

        graphics.setColor( Color.blue );
        graphics.drawLine( WIDTH, HEIGHT, 0, HEIGHT );

        graphics.setColor( Color.green );
        graphics.drawLine( 0, HEIGHT, 0, 0 );
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