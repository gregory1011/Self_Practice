package day27_Static;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public String batchNumber;
    public String groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String ProgrammingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, String batchNumber, String groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        ProgrammingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("School name is: " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Secret code is: "+ secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending " + batchNumber + " of the group "+ groupNumber);
    }

    public void study(){
        System.out.println(name + " is studying " + ProgrammingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
