package day18_GarbageColletion;

public class frequencyString {
    public static void main(String[] args) {


        String str = "aaabbccccddeeee";
        String result = "";
        int highFrequency = 0;


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {
                if(ch == str.length()){
                    count++;
                    System.out.println(count);
                }
            }



        }
    }
}
/*
 Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e

 */