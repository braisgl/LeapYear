public class Year {

    public static int year;
    public Year(int year){
        Year.year = year;
    }

    public boolean isLeapYear() {
        return isDivisibleBy(100) ? isDivisibleBy(400) : isDivisibleBy(4);
    }

    private static boolean isDivisibleBy( int divisor) {
        return year % divisor == 0;
    }
}