package bascis;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExamples {

    @Test
    public void testAssertEquals(){

        //given
        Calculator calculator = new Calculator();

        //when
        int results = calculator.add(6,65);

        //then
        Assertions.assertEquals(71, results);
    }

    @Test
    public void testCalculatorSubtraction(){
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.subtract(65, 14);

        //then
        Assertions.assertEquals(50, result);
    }

    @Test
    public void testCalculatorsDaugyba(){

        //given
        Calculator calculator = new Calculator();

        //when
        int results = calculator.daugyba(2,5);

        //then
        Assertions.assertEquals(10, results);
    }

    @Test
    public void testCalculatorsDalyba(){

        //given
        Calculator calculator = new Calculator();

        //when
        int results = calculator.dalyba(65,5);

        //then
        Assertions.assertEquals(13, results);
    }
}
