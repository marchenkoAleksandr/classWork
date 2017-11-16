package november2.enumer;


public class Example {

    public static void main(String[] args) {

//        Month x = Month.March;
//        Month y = Month.February;
//        Month z = Month.March;
//
//        System.out.println(x.equals(y));
//        System.out.println(x.equals(z));
//
//        System.out.println(x == z);
//
//        System.out.println(Month.March.name());
//        System.out.println(Month.March.ordinal());
//
//        System.out.println(Month.March);

//        for (Month month : Month.values()) {
//            System.out.printf("Month: %s, in russian: %s. \n",month.name(), month.ruName);
//        }
//
//        Month sw = Month.March;
//
//        switch (sw) {
//            case February:
//                System.out.println("f");
//                break;
//            case March:
//                System.out.println("m");
//            case January:
//                System.out.println("j");
//        }
//
//        Month.January.print();

        for (Month month : Month.values()) {
            System.out.println(month.action());
        }
//
//        String str = "January";
//
//        Month var = null;
//
//        for (Month month : Month.values()) {
//            if (month.name().equals(str)) {
//                var = month;
//            }
//        }
//
//        System.out.println(var.ordinal());

        Month january = Month.getByName("January");

        System.out.println(january.ruName);

    }

}
