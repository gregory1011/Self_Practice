package day31_inhiritance.studentTask;

public class Student extends Person{

    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if ( fieldOfStudy == null || fieldOfStudy.isEmpty()){
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C'
        || grade == 'D' || grade == 'F'){
            this.grade = grade;
        }else {
            System.err.println("Invalid grade");
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if ( schoolName == null || schoolName.isEmpty()){
            System.err.println("Invalid school name");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+ " is studying");
    }

    @Override
    public String toString() {
        return super.toString().replace('}', ' ')+
                ", studentId=" + getStudentId() +
                ", fieldOfStudy=" + getFieldOfStudy() +
                ", grade=" + getGrade() +
                ", schoolName=" + getSchoolName() +
                '}';
    }


}
