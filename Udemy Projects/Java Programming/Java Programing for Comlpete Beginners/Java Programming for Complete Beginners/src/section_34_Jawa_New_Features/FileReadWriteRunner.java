package section_34_Jawa_New_Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("../resources/example.txt");

        if (Files.exists(path)) {
            String fileContent = Files.readString(path);
            System.out.println(fileContent);
        } else {
            System.out.println("File does not exist at the specified path..");
        }
    }
}
