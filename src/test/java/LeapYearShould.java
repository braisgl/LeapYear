import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearShould {

    LeapYear leapYear = new LeapYear();

    @Test
    void isDivisibleBy4(){
        Assertions.assertEquals(true, leapYear.isLeapYear(4));
    }

    @Test
    void isNotDivisibleBy4() {
        Assertions.assertEquals(false, leapYear.isLeapYear(2));
    }

    @Test
    void isDivisibleBy400(){
        Assertions.assertEquals(true, leapYear.isLeapYear(400));
    }


}
