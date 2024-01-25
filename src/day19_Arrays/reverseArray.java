package day19_Arrays;
import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5,6,7,8,9};

        System.out.println(Arrays.toString(array));

        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        System.out.println(Arrays.toString (reversedArray));

    }
}
