package JavaAdvancedFeatures.input_output.file_write;

import JavaAdvancedFeatures.input_output.InputOutputUtils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(InputOutputUtils.RESULT_FILE_LOCATION))){
            String text = "siandien yra sekmadienis \nlauke apsinauke \nsniegas tirpsta";
            bw.write(text);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
