import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class SquareGrid {
    public static void mainDraw(Graphics graphics) {
        int x = 150;
        int y = 150;
        int size = 200;
        secondDraw(graphics, x, y, size );

    }
    private static void secondDraw(Graphics graphics, int x, int y, int size) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setStroke( new BasicStroke( size/10 ) );
        graphics.setColor( new Color( (int) (Math.random() * 255), (int) (Math.random() * 255),
                (int) (Math.random() * 255) ) );
        graphics.drawRect( x, y, size, size );
        if (size > 25) {
            secondDraw(graphics, x + size / 2 + size/4, y - size / 2 + size/4, size / 2);
            secondDraw(graphics, x + size / 2 + size/4, y + size / 2 + size/4, size / 2);
            secondDraw(graphics, x - size / 2 + size/4, y - size / 2 + size/4, size / 2);
            secondDraw(graphics, x - size / 2 + size/4, y + size / 2 + size/4, size / 2);
        }
    }




    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame( "Drawing" );
        jFrame.setSize( new Dimension( WIDTH, HEIGHT ) );
        jFrame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        jFrame.add( new ImagePanel() );
        jFrame.setLocationRelativeTo( null );
        jFrame.setVisible( true );
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent( graphics );
            mainDraw( graphics );

        }
    }
}
