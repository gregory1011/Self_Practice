package day21_Arrays;

public class CydeoStudents {
    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String [][] batch1Groups = {batch1Group1, batch1Group2, batch1Group3};

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String [][] batch2Groups ={batch2Group1, batch2Group2, batch2Group3};

        String [][][] CydeoStudents = {batch1Groups, batch2Groups};

        for (int i = 0; i < CydeoStudents.length; i++) {
           String [][] arra2D = CydeoStudents[i];

            for (int j = 0; j < arra2D.length; j++) {
                String [] arr1D = arra2D[j];

                for (int k = 0; k < arr1D.length; k++) {
                    String names = arr1D[k];

                    System.out.println(names);
                }
            }

        }


    }
}
