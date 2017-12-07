import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        List<String> content = new ArrayList();
        content.add("ze camel");
        try {
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath, content);
            System.out.println(content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}