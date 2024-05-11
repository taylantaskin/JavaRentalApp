package com.atduyar.rental.Controls;

import com.atduyar.rental.Controls.Common.Receipt;
import com.atduyar.rental.Domain.Entity.*;

import java.util.List;

public class RentalControl {
    private SuperRent superRent;
    private Store store;
    public RentalControl(SuperRent superRent, Store store) {
        this.superRent = superRent;
        this.store = store;
    }

    public Rental createRental(Member member) {
        return new Rental(member, store);
    }

    public void addItem(Rental rental, int serialNumber) throws Exception {
        Store store = rental.getStore();
        Item item = store.findItem(serialNumber);
        if (item == null) {
            throw new Exception("Item could not find in store.");
        }
        rental.addItem(item);
    }

    public void removeItem(Rental rental, int serialNumber) throws Exception {
        Store store = rental.getStore();
        Item item = store.findItem(serialNumber);
        if (item == null) {
            throw new Exception("Item could not find in store.");
        }
        rental.removeItem(item);
    }

    public double getTotalPrice(Rental rental) {
        return rental.getPrice();
    }

    public Receipt complete(Rental rental) {
        rental.complete();
        superRent.addRental(rental);
        return new Receipt(rental);
    }

}
