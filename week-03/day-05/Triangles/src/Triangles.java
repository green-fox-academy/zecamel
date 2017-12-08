import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static int steps =3;
    public static void mainDraw(Graphics graphics) {

        graphics.drawLine(0,0, WIDTH, 0 );
        graphics.drawLine( WIDTH, 0, WIDTH / 2, HEIGHT-23 );
        graphics.drawLine( WIDTH / 2, HEIGHT-23, 0, 0 );


    }

    public static void secondDraw(Graphics graphics) {

    }







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


