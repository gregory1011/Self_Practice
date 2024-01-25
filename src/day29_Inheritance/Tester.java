package day29_Inheritance;

public class Tester {

    private String name;
    private char gender;
    private int age;
    private  String ID, jobTitle;
    private double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != 'M' && gender != 'F' ){
            System.err.println("Invalid gender credential");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.err.println("Negative age");
            System.exit(1);
        }else if (age < 18 || age > 65){
            System.err.println("Age must be between 18 and 65");
            System.exit(1);
        }else {
            this.age = age;
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0 ){
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void setInfo(String name, char gender, int age, String ID, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setID(ID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public void testing(){
        System.out.println(name+ " is testing");
    }



    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



}
