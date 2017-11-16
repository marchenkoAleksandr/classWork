package september28;

import java.util.Arrays;

/**
 * Created by kovalchuk on 28.09.2016.
 */
public class Array {

    public static void main(String[] args) {
//        int[][] array = new int[3][];
//        array[0] = new int[4];
//        array[1] = new int[6];
//        array[2] = new int[8];
//        System.out.println(Arrays.deepToString(array));

//        int[][] ar = {{3, 5, 6}, {8, 9, 0, 6, 7}};
//        System.out.println(Arrays.deepToString(ar));

//        int n = 3;
//        int m = 5;
//        String[][] strings = new String[n][m];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                strings[i][j] = "" + i + j;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                for (;;) {
//                    while (true) {
//                    }
//                }
//            }
//            System.out.println();
//        }

        String[] arr = {"a", "d", "7", "sdf", "90"};

        for(String s : arr) {
            System.out.println(s);
        }

        String[][] arr2 = new String[4][4];

        for(String[] s : arr2) {
            for (String b : s) {

            }
        }
    }
}
