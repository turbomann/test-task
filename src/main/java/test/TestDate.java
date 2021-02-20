package test;


import java.util.Calendar;
import java.time.*;
import java.util.Date;
import java.util.UUID;

public class TestDate {
    public static void main(String[] args) {
//        int calendar = Calendar.MONTH + 1;
//        System.out.println(calendar);

        Calendar calendar = Calendar.getInstance();

        int Date = calendar.get(Calendar.DAY_OF_MONTH);
        int Month = Calendar.FEBRUARY;
        int Year = calendar.get(Calendar.YEAR);

        System.out.println(Date);
        System.out.println(Month);
        System.out.println(Year);





    }
}
