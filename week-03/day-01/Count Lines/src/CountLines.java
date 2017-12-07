import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        try {

            Path filePath = Paths.get("some-file.txt");
            List <String> lines = Files.readAllLines(filePath);
            System.out.println(lines.size());
        } catch (Exception e) {
            System.err.println("0");

        }
    }
}
