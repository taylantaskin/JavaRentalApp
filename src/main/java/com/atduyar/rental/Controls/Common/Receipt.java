package com.atduyar.rental.Controls.Common;

import com.atduyar.rental.Domain.Entity.Rental;
import com.atduyar.rental.Domain.Entity.RentalInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Receipt {
    private List<ReceipItem> items;
    private Date date;
    private String customerName;
    private double totalPrice;

    public Receipt(Rental rental) {
        this.items = new ArrayList<>();
        List<RentalInfo> rentalInfos = rental.getRentalInfos();
        for (RentalInfo re : rentalInfos) {
            this.items.add(new ReceipItem(re));
        }

        this.customerName = rental.getMember().getName();
        this.date = rental.getRentalDate();
        this.totalPrice = rental.getPrice();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\t----RECIPT----\n");
        s.append("DATE: " + date + "\n");
        s.append("CUSTOMER: " + customerName + "\n");
        s.append("---------------------\n");
        for (ReceipItem ri : items) {
            s.append(ri);
        }
        s.append("---------------------\n");
        s.append("TOTAL PRICE: ").append(totalPrice).append("\n");
        return s.toString();
    }
}
