package com.atduyar.rental.Domain.Entity;

import com.atduyar.rental.Domain.Enums.TitleType;

import java.util.Currency;
import java.util.Objects;

public abstract class Title {
    private int rentalCode;
    private String name;
    private String description;
    private TitleType type;

    public Title(String name, String description, int rentalCode, TitleType type) {
        this.name = name;
        this.description = description;
        this.rentalCode = rentalCode;
        this.type = type;
    }

    public abstract int getPrice();

    public abstract double getLateFeePerDay(long day);

    public int getRentalCode() {
        return rentalCode;
    }

    public void setRentalCode(int rentalCode) {
        this.rentalCode = rentalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TitleType getType() {
        return type;
    }

    public void setType(TitleType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Title title = (Title) o;
        return rentalCode == title.rentalCode && Objects.equals(name, title.name)
                && Objects.equals(description, title.description) && type == title.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentalCode, name, description, type);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Title{" +
                "rentalCode=" + rentalCode +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }

    public int getRentalDuration() {
        switch (type) {
            case NORMAL:
                return 14;
            case NEW_RELEASE:
                return 7;
            case PROMOTIONAL:
                return 20;
            default:
                throw new UnsupportedOperationException("unsupported titletype");
        }
    }

}
