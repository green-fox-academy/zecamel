import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountAs {
    public static void main(String[] args) {
        int counter = 0;
        Path filePath = Paths.get("src/afile.txt");

        try {
            List<String> string = Files.readAllLines( filePath );
            for (int i = 0; i <string.size() ; i++) {
                while (string.contains( "a" )) {
                    counter++;
                }
                System.out.println(counter);
            }

        } catch (Exception exc) {
            System.out.println(counter);
        }
    }
}