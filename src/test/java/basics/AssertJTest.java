package basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest {

    @Test
    public void testAssertJMatchers(){
        // given
        String text = "abc";
        String[] textArr = {"abc", "efg", "ogf"};

        // when

        // then
        Assertions.assertThat(textArr)
                .hasSize(3)
                .contains(text)
                .contains("ogf")
                .doesNotContain("AAAAAAAAAA");
    }

    @Test
    public void shouldAddTwoNumbers(){
        //given
        int num1 = 5;
        int num2 = -1;

        //when
        int result = num1 + num2;

        //then
        Assertions.assertThat(result)
                .isEqualTo(5)
                .isNotEqualTo(6)
                .isLessThan(200)
                .isGreaterThan(5)
                .isBetween(-99, 8);
    }
}
