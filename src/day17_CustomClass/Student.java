package day17_CustomClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public String studentID;
    public String grade;
    public String isFullTime;


    public void StudentSetInfo(String name, char gender, int age, String studentID, String grade, String isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                ", isFullTime='" + isFullTime + '\'' +
                '}';
    }

    public void study(){
        System.out.println(name+" is study");
    }

}
