package com.atduyar.rental.Domain.Entity;

import java.util.Calendar;
import java.util.Date;

public class RentalInfo {
    private Date dueDate;
    private Date dateReturned;
    private Item item;
    private Rental rental;

    public RentalInfo(Item item, Rental rental) {
        this.item = item;
        this.rental = rental;

        Calendar c = Calendar.getInstance();
        c.setTime(rental.getRentalDate());
        c.add(Calendar.DATE, item.getRentalDuration());
        this.dueDate = c.getTime();
    }

    @Override
    public String toString() {
        return "RentalInfo{" +
                "dueDate=" + dueDate +
                ", dateReturned=" + dateReturned +
                ", item=" + item.getTitle().getName() +
                '}';
    }

    public Rental getRental() {
        return rental;
    }
}
