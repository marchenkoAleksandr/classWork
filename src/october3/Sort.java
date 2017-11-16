package october3;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        int[] array = {2, 5, 1, 14, 10, 7, 12, 9, 6, 20};
//        bubbleSort(array);

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                if (array[j] > array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

    }
}
