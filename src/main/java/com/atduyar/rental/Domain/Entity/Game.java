package com.atduyar.rental.Domain.Entity;

import com.atduyar.rental.Domain.Enums.TitleType;

import java.util.Objects;

public class Game extends Title {
    private String producer;;
    private int year;

    public Game(String name, String description, int rentalCode, TitleType type, String producer, int year) {
        super(name, description, rentalCode, type);
        this.producer = producer;
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getPrice() {
        return 59;
    }

    @Override
    public double getLateFeePerDay(long day) {
        return day*2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Game game = (Game) o;
        return year == game.year && Objects.equals(producer, game.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), producer, year);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Game{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                '}';
    }

}
