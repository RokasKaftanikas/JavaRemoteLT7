package basics;

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
        Assertions.assertEquals(51, result);
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

    @Test
    public  void testAssertTrueFalse(){
        //given
        int firstNum = 5;
        int secondNum = 15;

        //when
        boolean condition = firstNum == secondNum;

        //then
        Assertions.assertTrue(firstNum != secondNum);
        Assertions.assertFalse(condition);
    }

    @Test
    public void testAssertNulOrNotNull(){
        //given
        String emptyText = null;
        String text = "sekmadienis";

        //when

        //then
        Assertions.assertNull(emptyText);
        Assertions.assertNotNull(text);
    }

    @Test
    public void testArraysEquals(){
        //given
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {1, 2, 3};

        //when

        //then
        Assertions.assertArrayEquals(firstArr, secondArr);
    }

    @Test
    public void testSameOrNotSame(){
        //given
        String text = "abc";
        String text1 = "abc";
        String text2 = new String("abc");

        //when

        //then
        Assertions.assertSame(text, text1);
        Assertions.assertNotSame(text, text2);
    }
}
