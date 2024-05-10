package com.atduyar.rental.Domain.Entity;

import java.util.Objects;

public class Item {
    private int serialNumber;
    private Title title;

    public Item(int serialNumber, Title title) {
        this.serialNumber = serialNumber;
        this.title = title;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Item item = (Item) o;
        return serialNumber == item.serialNumber ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, title);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Item{" +
                "serialNumber=" + serialNumber +
                ", title=" + title +
                '}';
    }

    public int getPrice() {
        return title.getPrice();
    }

    public int getRentalDuration() {
        return title.getRentalDuration();
    }
     public double getLateFeePerDay(long day){
        return title.getLateFeePerDay(day);
     }

}
