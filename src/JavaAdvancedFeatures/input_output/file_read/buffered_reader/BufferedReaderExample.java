package JavaAdvancedFeatures.input_output.file_read.buffered_reader;

import JavaAdvancedFeatures.input_output.InputOutputUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(InputOutputUtils.DATA_FILE_LOCATION);
            BufferedReader br = new BufferedReader(fileReader);

            String line;
            do {
                line = br.readLine();
                if (line != null){
                System.out.println(line);
            }
        } while (line != null);

            br.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found. " + InputOutputUtils.DATA_FILE_LOCATION);
            System.out.println(e.getMessage());
        } catch (IOException ex){
            System.out.println("Blogas failo formatas");
            System.out.println(ex.getMessage());
        }
    }
}
