import java.awt.*;

public class Main {
    public static void main(String[] args) {

        PostIt postit1 = new PostIt();
        postit1.setBackgroundColor( Color.orange );
        postit1.setText("Idea 1");
        postit1.setTextColor( Color.blue );

        PostIt postit2 = new PostIt();
        postit2.setBackgroundColor( Color.pink );
        postit2.setText("Awesome");
        postit2.setTextColor( Color.black );

        PostIt postit3 = new PostIt();
        postit3.setBackgroundColor( Color.yellow );
        postit3.setText("Superb");
        postit3.setTextColor( Color.green );

        System.out.println(postit3.text);

    }
}
