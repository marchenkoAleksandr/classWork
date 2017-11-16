package october28;

import october28.inherit.A;
import october28.inherit.B;
import october28.privateConstruct.RockStar;
import october28.privateConstruct.Singleton;

/**
 * Created by kovalchuk on 28.10.2016.
 */
public class Program {

    public static void main(String[] args) {

        B b = new B();
        A a = b;

        //b.print();

        A myself = a.getMyself();

        myself.print();

        //----------------- private constructor

        RockStar rockStar = RockStar.getInstance();
        RockStar rockStar2 = RockStar.getInstance();

//        Singleton singleton = Singleton.singleton;

    }

    public static void example(A a) {
        a.print();
    }

}
