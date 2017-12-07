import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {

        try {

            Path filePath = Paths.get( "DublicatedCharts.txt" );
            List<String> str = Files.readAllLines( filePath );

            for (int i = 0; i <str.size() ; i++) {
                for (int j = 0; j < str.get( i ).length() ; j+=2) {

                    System.out.print(str.get( i ).charAt( j ));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println( "nah mate, not happening." );

        }
    }
}
