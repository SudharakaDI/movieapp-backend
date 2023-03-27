package com.movies.movieapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;
//
//@Entity
//public class Movie {
//    private @Id @GeneratedValue Integer id;
//    private String title;
//    private String imageURL;
//    private String release;
//    private Boolean watched;
//    private String description;
//
//
//    public Movie() {
//
//    }
//
//    public Movie( String title, String imageURL, String release, Boolean watched, String description) {
//        this.title = title;
//        this.imageURL = imageURL;
//        this.release = release;
//        this.watched = watched;
//        this.description = description;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getImageURL() {
//        return imageURL;
//    }
//
//    public void setImageURL(String imageURL) {
//        this.imageURL = imageURL;
//    }
//
//    public String getRelease() {
//        return release;
//    }
//
//    public void setRelease(String release) {
//        this.release = release;
//    }
//
//    public Boolean getWatched() {
//        return watched;
//    }
//
//    public void setWatched(Boolean watched) {
//        this.watched = watched;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Movie movie = (Movie) o;
//        return Objects.equals(id, movie.id) && Objects.equals(title, movie.title) && Objects.equals(imageURL, movie.imageURL) && Objects.equals(release, movie.release) && Objects.equals(watched, movie.watched) && Objects.equals(description, movie.description);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, title, imageURL, release, watched, description);
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", imageURL='" + imageURL + '\'' +
//                ", release='" + release + '\'' +
//                ", watched=" + watched +
//                ", description='" + description + '\'' +
//                '}';
//    }
//}

@Entity
public class Movie{
    private @Id @GeneratedValue Integer id;
    private String title;
    private String description;
    private String rel;
    private String imageURL;
    private Boolean watched;


    public Movie() {
    }

    public Movie(String title, String description, String rel, String imageURL, Boolean watched) {
        this.title = title;
        this.description = description;
        this.rel = rel;
        this.imageURL = imageURL;
        this.watched = watched;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Boolean getWatched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) && Objects.equals(title, movie.title) && Objects.equals(description, movie.description) && Objects.equals(rel, movie.rel) && Objects.equals(imageURL, movie.imageURL) && Objects.equals(watched, movie.watched);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, rel, imageURL, watched);
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rel='" + rel + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", watched=" + watched +
                '}';
    }
}