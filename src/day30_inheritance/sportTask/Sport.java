package day30_inheritance.sportTask;

public class Sport {

    private String name;
    private int numberOfPlayers, numberOFReferee;
    private String rules;


    public Sport(String name, int numberOfPlayers, int numberOFReferee, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOFReferee(numberOFReferee);
        setRules(rules);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOFReferee() {
        return numberOFReferee;
    }

    public void setNumberOFReferee(int numberOFReferee) {
        this.numberOFReferee = numberOFReferee;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOFReferee=" + numberOFReferee +
                ", rules='" + rules + '\'' +
                '}';
    }



}
