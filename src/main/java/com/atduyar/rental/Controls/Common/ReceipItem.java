package com.atduyar.rental.Controls.Common;

import com.atduyar.rental.Domain.Entity.Item;
import com.atduyar.rental.Domain.Entity.RentalInfo;

import java.util.Date;

public class ReceipItem {
    private String name;
    private double price;
    private Date returnDate;

    public ReceipItem(String name, double price, Date returnDate) {
        this.name = name;
        this.price = price;
        this.returnDate = returnDate;
    }

    public ReceipItem(RentalInfo rentalInfo) {
        returnDate =rentalInfo.getDueDate();
        Item item = rentalInfo.getItem();
        name = item.getTitle().getName();
        price = item.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%s\t %.2f$\t %s\n", name,price,returnDate);
    }
}
