package com.atduyar.rental.Domain.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Rental {
    /**
     * rentin tamamlandığı zaman
     */
    private Date rentalDate;
    private Member member;
    private Store store;
    private List<Item> items;
    private List<RentalInfo> rentalInfos;


    public Rental(Date rentalDate, Member member, Store store, List<Item> items, List<RentalInfo> infos) {
        this.rentalDate = rentalDate;
        this.member = member;
        this.store = store;
        this.items = items;
        this.rentalInfos = infos;
    }

    public Rental(Member member, Store store) {
        this.member = member;
        this.store = store;
        this.items = new ArrayList<>();
        this.rentalInfos = new ArrayList<>();
    }

    public void addItem(Item item) {
        for (Item i : items) {
            if (item.getSerialNumber() == i.getSerialNumber()) {
                return;
            }
        }
        items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void complete() {
        rentalDate = new Date();
        for (Item item: items){
            rentalInfos.add(new RentalInfo(item,this));
            store.removeItem(item);
        }
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public List<RentalInfo> getRentalInfos() {
        return rentalInfos;
    }

    public Store getStore() {
        return store;
    }

    public Member getMember() {
        return member;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalDate=" + rentalDate +
                ",\n member=" + member +
                ",\n store=" + store +
                ",\n items=" + items +
                ",\n infos=" + rentalInfos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Rental rental = (Rental) o;
        return Objects.equals(rentalDate, rental.rentalDate) && Objects.equals(member, rental.member)
                && Objects.equals(store, rental.store) && Objects.equals(items, rental.items)
                && Objects.equals(rentalInfos, rental.rentalInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentalDate, member, store, items, rentalInfos);
    }

    public int getPrice() {
        int total = 0;
        for (Item item : items) {
            total = total + item.getPrice();
        }
        /*
         * for (int i;i<items.size();i++){
         * total = total + items.get(i).getPrice();
         */
        return total;
    }

}
