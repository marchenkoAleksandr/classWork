package december7.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserExamp {

    public static void main(String[] args) throws ParseException {

        User user = new User("Anatoliy", new Date());

        System.out.println(user);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String formated = simpleDateFormat.format(user.getRegistered());
        System.out.println(formated);

        String src = "2016.12.07 20:54:30:123";
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss:SSS");
        Date newDate = format.parse(src);
        System.out.println(new SimpleDateFormat("yyyy.MM.dd HH:mm:ss:SSS").format(newDate));

    }
}
