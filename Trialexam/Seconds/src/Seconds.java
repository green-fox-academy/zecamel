import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seconds {
    public static void main(String[] args) {
        List<Integer> listOriginal = new ArrayList<>( Arrays.asList( 1, 2, 3, 4, 5, 6, 7 ) );
        System.out.println( listModofied( listOriginal ) );
    }

    public static List<Integer> listModofied(List<Integer> listOriginal) {
        List<Integer> listModified = new ArrayList<>();
        for (int i = 0; i < listOriginal.size(); i += 2) {
            listModified.add( listOriginal.get( i ) );
        }
        return listModified;
    }
}
