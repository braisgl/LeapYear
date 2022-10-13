public class Year {

    public static int year;
    public Year(int year){
        Year.year = year;
    }

    public boolean isLeapYear() {
        if (isDivisibleBy(100) && !isDivisibleBy(400)) {
            return false;
        }

        if (isDivisibleBy(4) || isDivisibleBy( 400)) {
            return true;
        }

        return false;
    }

    private static boolean isDivisibleBy( int divisor) {
        return year % divisor == 0;
    }
}