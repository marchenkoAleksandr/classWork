package october26.imp;

import october26.eqHash.*;

import static java.util.Arrays.deepToString;
import static october26.eqHash.Entity.*;

public class Pack {

    public static void main(String[] args) {

        System.out.println(NUMBER);
        System.out.println(NUMBER2);

        int[][] array = new int[10][10];

        System.out.println(deepToString(array));

        Entity entity = new Entity(1);
        EqualHash eh = new EqualHash();
        ObjectMethods om = new ObjectMethods();
    }
}
