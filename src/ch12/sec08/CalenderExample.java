package ch12.sec08;

import java.util.Calendar;

public class CalenderExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        int week = now.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch (week) {
            case Calendar.MONDAY: strWeek = "Monday"; break;
            case Calendar.TUESDAY: strWeek = "Tuesday"; break;
            case Calendar.WEDNESDAY: strWeek = "Wednesday"; break;
            case Calendar.THURSDAY: strWeek = "Thursday"; break;
            case Calendar.FRIDAY: strWeek = "Friday"; break;
            case Calendar.SATURDAY: strWeek = "Saturday"; break;
            default: strWeek = "Sunday"; break;
        }
        int amPm = now.get(Calendar.AM_PM);
        String strAmPm = null;
        if (amPm == Calendar.AM) {
            strAmPm = "AM";
        } else {
            strAmPm = "PM";
        }
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.print(year);
        System.out.print(month);
        System.out.print(day);
        System.out.print(week);
        System.out.print(amPm);
        System.out.print(hour);
        System.out.print(minute);
        System.out.print(second);

    }
}
