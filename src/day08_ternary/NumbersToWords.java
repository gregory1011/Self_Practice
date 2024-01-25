package day08_ternary;

public class NumbersToWords {

    public static void main(String[] args) {

      int n = -4;
      String result ;

      result = (n==0)?"Zero":(n == 1)?"One":(n == 2)?"Two":(n == 3)?"Three":(n == 4)?"Four":
              (n == 5)?"Five":(n == 6)? "Six" : (n == 7)?" Seven":(n == 8)?
                      "Eight":(n== 9)?"Nine":"Invalid";

        System.out.println(result);

    }
}
