import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}
