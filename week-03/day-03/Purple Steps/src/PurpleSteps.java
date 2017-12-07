import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

    public static void mainDraw(Graphics graphics){
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]


        int nrofsq = 20;
        int size = WIDTH/nrofsq;
        Color purple = new Color(136, 120, 195);


        for (int i = 0; i <nrofsq ; i++) {
            graphics.setColor(purple);
            graphics.fillRect( i*size,i*size,size,size );


        }


        for (int i = 0; i <nrofsq ; i++) {
            graphics.setColor( Color.black );
            graphics.drawRect( i*size,i*size,size,size );

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