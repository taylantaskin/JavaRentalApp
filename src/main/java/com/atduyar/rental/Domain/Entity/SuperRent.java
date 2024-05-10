package com.atduyar.rental.Domain.Entity;

import java.util.List;
import java.util.Objects;

public class SuperRent {
    private List<Member> members;
    private List<DailyLog> dailyLogs;
    private List<Rental> rentals;
    private List<Store> stores;

    Catalog catalog;

    public SuperRent() {
    }

    public SuperRent(List<Member> members, List<DailyLog> dailyLogs, List<Rental> rentals, List<Store> stores,
            Catalog catalog) {
        this.members = members;
        this.dailyLogs = dailyLogs;
        this.rentals = rentals;
        this.stores = stores;
        this.catalog = catalog;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<DailyLog> getDailyLogs() {
        return dailyLogs;
    }

    public void setDailyLogs(List<DailyLog> dailyLogs) {
        this.dailyLogs = dailyLogs;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SuperRent superRent = (SuperRent) o;
        return Objects.equals(members, superRent.members) && Objects.equals(dailyLogs, superRent.dailyLogs)
                && Objects.equals(rentals, superRent.rentals) && Objects.equals(stores, superRent.stores)
                && Objects.equals(catalog, superRent.catalog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, dailyLogs, rentals, stores, catalog);
    }

    @Override
    public String toString() {
        return "Domain.Entity.SuperRent{" +
                "members=" + members +
                ", dailyLogs=" + dailyLogs +
                ", rentals=" + rentals +
                ", stores=" + stores +
                ", catalog=" + catalog +
                '}';
    }
}
