package october3;

import java.util.Arrays;

public class Copy {

    public static void main(String[] args) {

        int[] src = {2, 5, 1, 14, 10, 7, 12, 9, 6, 20};
        int[] dest = new int[src.length * 2];

        System.arraycopy(src, 3, dest, 5, src.length - 3);

        System.out.println(Arrays.toString(dest));
    }

}
