public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        }
        return true;
    }
}
