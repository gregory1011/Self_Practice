package day26_Constructor;

public class CydeoStudent {

    public String name, groupNumber, id, grade;
    public int age, batchNumber;
    public char gender;

    public static String schoolName = "CydeoSchool";
    public static String magicWord = "Java";


    public CydeoStudent(String name, String groupNumber, String id, String grade, int age, int batchNumber, char gender) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.id = id;
        this.grade = grade;
        this.age = age;
        this.batchNumber = batchNumber;
        this.gender = gender;
    }


    public void study(){
        System.out.println(name + " is studying.");
    }

    public void attendClass(){
        System.out.println(name + " attend class.");
    }

    public static void printSchoolName(){
        System.out.println("School name: "+ schoolName);
    }

    public static void printProgLanguage (){
        System.out.println("Programing language: "+ magicWord);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", gender=" + gender +
                '}';
    }



}
