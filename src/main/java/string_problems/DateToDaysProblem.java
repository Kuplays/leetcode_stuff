package string_problems;

public class DateToDaysProblem {
    //https://leetcode.com/problems/day-of-the-year/description/
    int[] days = {
            31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365
    };
    public int dayOfYear(String date) {
        boolean isLeap = isLeap(parseInt(date.substring(0, 4), 4));
        int month = parseInt(date.substring(5, 7), 2);
        int daysNumber = parseInt(date.substring(8), 2);
        int totalDays = (month == 1) ? daysNumber : days[month - 2] + daysNumber;
        return isLeap && (month > 2) ? totalDays + 1 : totalDays;
    }

    private boolean isLeap(int year) {
        if (year % 4 != 0) return false;
        if (year % 400 == 0) return true;
        return year % 100 != 0;
    }

    private int parseInt(String s, int len)
    {
        int num  = 0;
        int sign = -1;
        //final int len  = s.length();
        final char ch  = s.charAt(0);
        if (ch == '-')
            sign = 1;
        else
            num = '0' - ch;
        int i = 0;
        while (i < len)
            num = num * 10 + '0' - s.charAt(i++);
        return sign * num;
    }
}
