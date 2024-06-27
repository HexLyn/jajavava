package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println(result1.format(dtf));

        LocalDateTime result2 = now.plusMonths(2);
        System.out.println(result2.format(dtf));

        LocalDateTime result3 = now.plusDays(3);
        System.out.println(result3.format(dtf));
    }
}
