import javax.swing.*;

        import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {

    public static void mainDraw(Graphics graphics) {
        // reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps-3d/r4.png]

//        multiplication method, status=failed
//        int size = 10;
//
//
//        Color purple = new Color( 136, 120, 195 );
//
//        for (int i = 0; i < 6; i++) {
//
//
//            graphics.setColor( purple );
//            graphics.fillRect( i*size ,i*size, i*size, i*size );
//
//
//        }
//
//
//        for (int i = 0; i < 6; i++) {
//
//            graphics.setColor( Color.black );
//            graphics.drawRect( i*size, i*size, i*size, i*size );
//
//        }

        int x = 10;
        int y = 10;
        for(int i = 0; i < 6; i++) {
            draw3dSquare(graphics,x,y);
            x = x + y;
            y = y + 10;
        }

    }

    public static void draw3dSquare(Graphics g, int x, int y) {
        g.setColor(new Color(136, 120, 195));
        g.fillRect(x,x,y,y);
        g.setColor(Color.BLACK);
        g.drawRect(x,x,y,y);
    }



        //    Don't touch the code below
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
