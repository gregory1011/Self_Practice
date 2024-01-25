package day31_inhiritance.studentTask;

public class CydeoStudent extends Student {

    private int  batchNumber, groupNumber;
    private String programmingLanguage;


    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, char grade,
                        String schoolName, int batchNumber, String programmingLanguage, int groupNumber) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);

        setBatchNumber(batchNumber);
        setProgrammingLanguage(programmingLanguage);
        setGroupNumber(groupNumber);

    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber < 0 ){
            System.err.println("Invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if ( programmingLanguage == null ){
            System.err.println("Invalid programing language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if ( groupNumber < 0){
            System.err.println("Invalid group number");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return super.toString().replace('}', '-')+
                        "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
