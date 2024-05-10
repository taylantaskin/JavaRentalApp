package com.atduyar.rental.Domain.Entity;

import com.atduyar.rental.Domain.Enums.TitleType;

import java.util.Objects;

public class Movie extends Title {
    private String director;
    private String cast;
    private int duraction;
    private int year;

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public double getLateFeePerDay(long day) {
        return day*3;
    }

    public Movie(int rentalCode, String name, String description, TitleType type, String director) {
        super(name, description, rentalCode, type);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Movie movie = (Movie) o;
        return duraction == movie.duraction && year == movie.year && Objects.equals(director, movie.director)
                && Objects.equals(cast, movie.cast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), director, cast, duraction, year);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Movie{" +
                "director='" + director + '\'' +
                ", cast='" + cast + '\'' +
                ", duraction=" + duraction +
                ", year=" + year +
                '}';
    }

}
