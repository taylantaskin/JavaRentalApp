package com.atduyar.rental.Domain.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DailyLog {
    private Date date;

    List<Rental> rentals;

    public DailyLog(List<Rental> rentals) {
        this.rentals = new ArrayList<>();
        this.rentals = rentals;
    }

    public DailyLog(Date date) {
        this.date = date;
        this.rentals = new ArrayList<>();
    }
    public DailyLog(){
        date = new Date();
        this.rentals = new ArrayList<>();

    }

    public void logRental(Rental rental) {
        rentals.add(rental);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Rental> getRentals() {
        return rentals;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        DailyLog dailyLog = (DailyLog) o;
        return Objects.equals(date, dailyLog.date) && Objects.equals(rentals, dailyLog.rentals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, rentals);
    }

    @Override
    public String toString() {
        return "Domain.Entity.DailyLog{" +
                "date=" + date +
                ", rentals=" + rentals +
                '}';
    }

}
