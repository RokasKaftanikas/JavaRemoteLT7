package basics;

import fundamentals_testing.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testCircleLength(){
        //given
        Circle circle = new Circle(10);

        //when
        int results = circle.calculateCircleLength();

        //then
        Assertions.assertEquals(62, results);
    }

    @Test
    public void testCircleArea(){
        //given
        Circle circle = new Circle(5);

        //when
        int results = circle.calculateCircleArea();

        //then
        Assertions.assertEquals(78, results);
    }
}
