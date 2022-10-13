import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class YearShould {

    Year year;

    @Test
    void isALeapYearIfDivisibleBy4(){
        year = new Year(4);
        Assertions.assertEquals(true, year.isLeapYear());
    }

    @Test
    void isNotALeapYearIfNotDivisibleBy4() {
        year = new Year(2);
        Assertions.assertEquals(false, year.isLeapYear());
    }

    @Test
    void isALeapYearIfDivisibleBy400(){
        year = new Year(400);
        Assertions.assertEquals(true, year.isLeapYear());
    }

    @Test
    void isNotALeapYearIfDivisibleBy100ButNot400() {
        year = new Year(100);
        Assertions.assertEquals(false, year.isLeapYear());
    }

    @ParameterizedTest
    @CsvSource({"1996", "1600"})
    void parametrizedTestTrue(int number) {
        year = new Year(number);
        Assertions.assertTrue(year.isLeapYear());
    }

    @ParameterizedTest
    @CsvSource({"1997", "1800"})
    void parametrizedTestFalse(int number) {
        year = new Year(number);
        Assertions.assertFalse(year.isLeapYear());
    }
}
