package day19_Arrays;

public class studentsGrade {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < grades.length; i++) {

            int score = scores[i];

            if (score >= 90) {
                grades[i] = 'A';
            } else if (score >= 80) {
                grades[i] = 'B';
            } else {
                grades[i] = 'C';
            }

            System.out.println(names[i] + "'s score is " + score + ", and grade is " + grades[i]);
        }

    }
}
