package com.atduyar.rental.Controls;

import com.atduyar.rental.Controls.Common.ItemInfo;
import com.atduyar.rental.Domain.Entity.Item;
import com.atduyar.rental.Domain.Entity.Store;

public class ItemsControl {
    private Store store;

    public ItemsControl(Store store) {
        this.store = store;
    }

    public ItemInfo getItemInformation(int serialNumber) throws Exception {
        Item item = store.findItem(serialNumber);
        if (item == null) {
            throw new Exception("Item could not find in store.");
        }
        return new ItemInfo(item);
    }

}
