import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearShould {

    LeapYear leapYear = new LeapYear();

    @Test
    void isALeapYearIfDivisibleBy4(){
        Assertions.assertEquals(true, leapYear.isLeapYear(4));
    }

    @Test
    void isNotALeapYearIfNotDivisibleBy4() {
        Assertions.assertEquals(false, leapYear.isLeapYear(2));
    }

    @Test
    void isALeapYearIfDivisibleBy400(){
        Assertions.assertEquals(true, leapYear.isLeapYear(400));
    }

    @Test
    void isNotALeapYearIfDivisibleBy100ButNot400() {
        Assertions.assertEquals(false, leapYear.isLeapYear(100));
    }

}
