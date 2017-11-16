package december7.date;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExamp {

    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
//        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));



    }
}
