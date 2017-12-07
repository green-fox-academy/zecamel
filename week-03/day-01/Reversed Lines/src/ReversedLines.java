import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {

        try {

            Path filePath = Paths.get( "ReversedLines.txt" );
            List<String> str = Files.readAllLines( filePath );

            for (int i = 0; i < str.size() ; i++) {
                for (int j = str.get( i ).length(); j > 0; j--) {

                    System.out.print( str.get( i ).charAt( j-1 ) );
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println( "nah mate, not happening." );

        }
    }
}
