package com.atduyar.rental.Controls.Common;

import com.atduyar.rental.Domain.Entity.Item;

public class ItemInfo {
    private  String description;
    private  String name;
    private double price;
    private int rentalDuration;

    public ItemInfo(Item item){
        description = item.getTitle().getDescription();
        name = item.getTitle().getName();
        price = item.getPrice();
        rentalDuration= item.getRentalDuration();

    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nDescription: " + description +
                "\nPrice: " + price +
                "\nRentalDuration: " + rentalDuration;
    }
}
