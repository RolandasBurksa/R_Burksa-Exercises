package section_29;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Path.*;

public class DirectoryScanRunner {

    public static void main(String[] args) throws IOException {
        
        Files.list(of(".")).forEach(System.out::println);

        Path currentDirectory = null;
        Files.walk(currentDirectory, 1);
    }
}
