package day29_Inheritance;

public class Developer {

    private String name;
    private char gender;
    private int age;
    private  String ID, jobTitle;
    private double salary;
    private String programmingLanguage;


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
        if (gender != 'M' && gender != 'F'){
            System.err.println("Invalid gender credential");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 0 ){
            System.err.println("Age can not be negative");
            System.exit(1);
        } else if ( age < 18 || age >65 ){
            System.err.println("Age must be between 18 amd 65");
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
        if ( salary < 0 ){
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if ( programmingLanguage.equals("Java") || programmingLanguage.equals("JavaScript")
                || programmingLanguage.equals("Python") || programmingLanguage.equals("Ruby")
        || programmingLanguage.equals("C#") || programmingLanguage.equals("C++")
        || programmingLanguage.equals("Swift")){
            this.programmingLanguage = programmingLanguage;
        }else {
            System.err.println("Invalid programing language");
            System.exit(1);
        }

    }

    public void setInfo(String name, char gender, int age, String ID, String jobTitle, double salary, String programmingLanguage) {
        setName(name);
        setGender(gender);
        setAge(age);
        setID(ID);
        setJobTitle(jobTitle);
        setSalary(salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public void coding (){
        System.out.println(name + " is coding in "+ programmingLanguage);
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
