import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Leap_YearTest {

    @Test
    void checkYear() {
        Leap_Year leapYear = new Leap_Year();
        assertEquals("leap year",leapYear.checkYear(2000));
    }

    @Test
    void checkNonLeapYear() {
        Leap_Year nonLeapYear = new Leap_Year();
        assertEquals("not a leap year",nonLeapYear.checkYear(2001));
    }
}