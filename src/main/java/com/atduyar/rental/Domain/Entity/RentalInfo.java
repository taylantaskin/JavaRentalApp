package com.atduyar.rental.Domain.Entity;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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

    public Date getDueDate() {
        return dueDate;
    }

    public Item getItem() {
        return item;
    }

    public Rental getRental() {
        return rental;
    }
    public double returnItem(){
        dateReturned = new Date();
        if(dateReturned.getTime() > dueDate.getTime()){
            long lateDay = TimeUnit.DAYS.convert(dateReturned.getTime() - dueDate.getTime(),TimeUnit.MILLISECONDS);
            return item.getLateFeePerDay(lateDay);
        }
        return 0;
    }
}
