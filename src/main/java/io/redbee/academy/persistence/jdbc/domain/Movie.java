package io.redbee.academy.persistence.jdbc.domain;

public class Movie {

    // is ok to make these following attributes 'private'?
    private Integer id;
    private String title;
    private Integer year;
    private String creation_user;

    public Movie(Integer id, String title, Integer year, String creation_user){
        this.id = id;
        this.title = title;
        this.year = year;
        this.creation_user = creation_user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCreation_user() {
        return creation_user;
    }

    public void setCreation_user(String creation_user) {
        this.creation_user = creation_user;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", creation_user='" + creation_user + '\'' +
                '}';
    }
}
