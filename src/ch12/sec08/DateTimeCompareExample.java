package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime startDateTime = LocalDateTime.of(2021,1,1,0,0,0);
        System.out.println(startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2021,12,31,1,0,0);
        System.out.println(endDateTime.format(dtf));

        if(startDateTime.isBefore(endDateTime)) {
            System.out.println("진행 중");
        } else if(startDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다.");
        } else if (startDateTime.isAfter(endDateTime)) {
            System.out.println("끝났어.");
        }

        long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);

        System.out.println(remainYear);
        System.out.println(remainMonth);
        System.out.println(remainDay);
        System.out.println(remainHour);
        System.out.println(remainMinute);
        System.out.println(remainSecond);
    }
}
