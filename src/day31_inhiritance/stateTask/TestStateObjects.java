package day31_inhiritance.stateTask;

public class TestStateObjects {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia", "VA", "Democrats", "John Wick", "William Doorman", 150_443, 5.25 );
        System.out.println(virginia);

        California california = new California("California", "CA", "Democrats", "Joe Rogan", "Dana White", 170_324, 9.50);
        System.out.println(california);

        Texas texas = new Texas("Texas", "TX", "Republicans", "Michael Cruz", "Nick Hernandez", 456_342, 6.50 );
        System.out.println(texas);



    }
}
