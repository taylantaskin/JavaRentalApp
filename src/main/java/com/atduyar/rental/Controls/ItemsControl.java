package com.atduyar.rental.Controls;

import com.atduyar.rental.Domain.Entity.Item;

public class ItemsControl {
    public Item getItemInformation(int _serialNumber) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public int getPrice(Item item) {
        return item.getPrice();
    }
}
