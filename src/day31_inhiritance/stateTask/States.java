package day31_inhiritance.stateTask;

public class States {

    private String name, abbreviation, politicalParty, governor, senator;
    private long population;
    private double stateTax;


    public States(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("Name can not be null/empty/blank");
            System.exit(1);
        }else {
           this.name = name;
        }

    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.isBlank()){
            System.err.println("Abbreviation party can not be null/empty/blank");
            System.exit(1);
        }else {
            this.abbreviation = abbreviation;
        }
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isBlank() || politicalParty.isEmpty()){
            System.err.println("Political party can not be null/empty/blank");
            System.exit(1);
        }else {
            this.politicalParty = politicalParty;
        }

    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isEmpty() || governor.isBlank()){
            System.err.println("Governor can not be null/empty/blank");
            System.exit(1);
        }else {
            this.governor = governor;
        }

    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isEmpty() || senator.isBlank()){
            System.err.println("Senator can not be null/empty/blank");
            System.exit(1);
        }else {
            this.senator = senator;
        }

    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (population <= 0 ){
            System.err.println("Population can not be negative or zero.");
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax < 0 ){
            System.err.println(" Tax rate can not be negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }



}
