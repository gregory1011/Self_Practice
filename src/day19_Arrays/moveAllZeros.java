package day19_Arrays;

import java.util.Arrays;

public class moveAllZeros {
    public static void main(String[] args) {

      int[] array = {10, 0, 5, 0, 1, 0};
        System.out.println(Arrays.toString(array));

        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0 ) {
                result[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(result));




    }
}
