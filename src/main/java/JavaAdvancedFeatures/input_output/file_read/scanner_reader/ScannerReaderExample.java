package JavaAdvancedFeatures.input_output.file_read.scanner_reader;

import JavaAdvancedFeatures.input_output.InputOutputUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReaderExample {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File(InputOutputUtils.DATA_FILE_LOCATION))){
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ex){
            System.out.println("File not found or file format is wrong");
            System.out.println(ex.getMessage());
        }
    }
}
