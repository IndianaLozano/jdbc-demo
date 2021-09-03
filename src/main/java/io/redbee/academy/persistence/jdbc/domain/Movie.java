package io.redbee.academy.persistence.jdbc.domain;

public class Movie {

    // is ok to make these following attributes 'private'?
    private static Integer id;
    private static String title;
    private static Integer year;
    private static String creation_user;

    public Movie(Integer id, String title, Integer year, String creation_user){
        this.id = id;
        this.title = title;
        this.year = year;
        this.creation_user = creation_user;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Movie.id = id;
    }

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Movie.title = title;
    }

    public static Integer getYear() {
        return year;
    }

    public static void setYear(Integer year) {
        Movie.year = year;
    }

    public static String getCreation_user() {
        return creation_user;
    }

    public static void setCreation_user(String creation_user) {
        Movie.creation_user = creation_user;
    }

    public static String toString(Movie movie){
        return "Movie{id = " + id + ", title = " + title + ", year = " + year + ", creation_user = " + creation_user + '}';
    }


}
