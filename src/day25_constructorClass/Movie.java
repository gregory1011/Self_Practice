package day25_constructorClass;

import day19_Arrays.Array;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Movie {

    public String country, title, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts;


    public Movie(String country, String title, String director, LocalDate releaseDate) {
        casts = new ArrayList<>();
        this.country = country;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast (String member){
        casts.add(member);
    }

    public void addCasts( String[] members){
        casts.addAll(Arrays.asList(members));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate.format(DateTimeFormatter.ofPattern("dd/MM/y")) +
                ", casts=" + casts +
                '}';
    }




}
