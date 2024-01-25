package day07_If_statements;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number =50;
        String result ="";


        if ( number == 50 || number== 75 || number == 100){

            if (number == 50){
                result="50  ===> 20 crew, 30 passengers";
            }else if (number== 75){
                result="75  ===> 25 crew, 50 passengers";
            }else{
                result="100  ===> 30 crew, 70 passengers";
            }

            }else{
            result = "Not valid";
        }

        System.out.println(result);

    }
}
