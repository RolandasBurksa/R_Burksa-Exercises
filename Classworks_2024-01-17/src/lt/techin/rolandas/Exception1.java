package lt.techin.rolandas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
//        File file = new File("File.txt");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found, check file name ...");;
//        } finally {
//            System.out.println("This message always ...");
//        }
        try {
            readFile();
        } catch (FileNotFoundException e){
            System.out.println("File not found ...");
        }

    }

    public static void readFile() throws FileNotFoundException {
            File file = new File("File.txt");
            Scanner scanner = new Scanner(file);
    }
}
