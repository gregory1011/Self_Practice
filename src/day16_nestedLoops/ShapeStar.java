package day16_nestedLoops;

public class ShapeStar {
    public static void main(String[] args) {

        char shape = '*';

        for (int i = 0; i < 10; i++) {


            for (int j = 0; j < i; j++) {
                System.out.print(shape + " ");
            }
            System.out.println();
        }

    }
}
