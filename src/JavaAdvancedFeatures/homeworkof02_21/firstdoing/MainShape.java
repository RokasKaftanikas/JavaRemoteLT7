package JavaAdvancedFeatures.homeworkof02_21.firstdoing;

import JavaAdvancedFeatures.homeworkof02_21.input_output_utils.Inputs_Outputs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Circle");
        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        RightAngleRectangle rightAngleRectangle = new RightAngleRectangle("Right Angle Rectangle", 2, 4);

        String text = circle.getArea() + "\n" + rectangle.getArea() + "\n" + rightAngleRectangle.getArea();
        System.out.println(text);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Inputs_Outputs.RESULTS_SHAPE_FILE_LOCATION))) {
            bw.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
