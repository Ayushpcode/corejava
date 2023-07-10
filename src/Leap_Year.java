public class Leap_Year {
    public String checkYear(int year) {
        if (year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
            return "leap year";
        } else {
            return  "not a leap year";
        }
    }
}
