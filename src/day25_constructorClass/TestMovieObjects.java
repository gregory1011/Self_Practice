package day25_constructorClass;

import java.time.LocalDate;

public class TestMovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA", "JavaDeveloper: Zero to Hero",
                "Kuzzat Altay", LocalDate.of(2021,4,18) );

        movie1.addCast("Aziz");
        movie1.addCasts(new String[]{"Ozzy", "Ali", "Muhtar", "Aizat", "Odil", "Selim", "Margarett"});

        System.out.println(movie1);







    }


}
