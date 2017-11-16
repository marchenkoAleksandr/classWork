package october5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public static void main(String[] args) {

//        String regExp = "^[\\w\\.]*[\\w]@[a-zA-Z-[\\d]*\\.]+[\\w]{2,4}$";

        String regExp = "asd";

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);

//        System.out.println(matcher.matches()); // полностью ли соответствует?
//        System.out.println(matcher.lookingAt()); // частично с начала
//        System.out.println(matcher.find()); // частично по очереди

//        matcher.matches();
//        System.out.println(matcher.group(3)); // группа по порядку
//        System.out.println(matcher.groupCount()); //кол-во совпадений


        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        matcher.reset();

        while (matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }

    }
}
