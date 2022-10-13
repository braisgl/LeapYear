public class LeapYear {

    public boolean isLeapYear(int year) {
        if (isDivisibleBy(year, 100) && !isDivisibleBy(year, 400)) {
            return false;
        }

        if (isDivisibleBy(year, 4) || isDivisibleBy(year, 400)) {
            return true;
        }

        return false;
    }

    private static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}