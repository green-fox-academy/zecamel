import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrdered {
    public static void main(String[] args) {

        try {

            Path filePath = Paths.get( "Reversed-order.txt" );
            List<String> str = Files.readAllLines( filePath );

            for (int i = str.size() - 1; i >= 0; i--) {
                System.out.println( str.get( i ) );
            }
        } catch (Exception e) {
            System.err.println( "nah mate, not happening." );

        }
    }
}