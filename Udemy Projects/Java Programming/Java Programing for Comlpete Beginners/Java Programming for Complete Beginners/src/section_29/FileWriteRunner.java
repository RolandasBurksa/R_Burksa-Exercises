package section_29;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

    public static void main(String[] args) throws IOException {
        Path currentDirectory = Paths.get("./Java Programming for Complete Beginners/section_29/data.txt");

        List<String> lines = Files.readAllLines(currentDirectory);
        System.out.println(lines);

        for (String line:lines) {
            System.out.println(line);
        }

    }
}
