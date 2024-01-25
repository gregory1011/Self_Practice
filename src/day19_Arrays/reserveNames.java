package day19_Arrays;

public class reserveNames {
    public static void main(String[] args) {

        String[] classMates = { "Grigore Rosca", "Ronaldo Golazo", "Messi Golding", "Gigi Becali"};


        for (int i = 0; i < classMates.length; i++) {
            String name = classMates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }
            System.out.println(reverseName);

        }


    }
}
