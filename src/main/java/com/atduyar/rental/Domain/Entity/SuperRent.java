package com.atduyar.rental.Domain.Entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SuperRent {
    private List<Member> members;
    private List<DailyLog> dailyLogs;
    private List<Rental> rentals;
    private List<Store> stores;
    private Catalog catalog;

    public SuperRent(List<Member> members, List<DailyLog> dailyLogs, List<Rental> rentals, List<Store> stores,
            Catalog catalog) {
        this.members = members;
        this.dailyLogs = dailyLogs;
        this.rentals = rentals;
        this.stores = stores;
        this.catalog = catalog;
    }

    public SuperRent() {
        members = new ArrayList<>();
        dailyLogs = new ArrayList<>();
        rentals = new ArrayList<>();
        stores = new ArrayList<>();
        catalog = null;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    private DailyLog getTodaysDailyLog() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date today = cal.getTime();

        DailyLog todaysDailyLog = null;
        for (DailyLog dl : dailyLogs) {
            if (dl.getDate().equals(today)) {
                todaysDailyLog = dl;
                break;
            }
        }
        if (todaysDailyLog == null) {
            todaysDailyLog = new DailyLog(today);
            dailyLogs.add(todaysDailyLog);
        }
        return todaysDailyLog;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
        DailyLog todaysDailyLog = getTodaysDailyLog();
        todaysDailyLog.logRental(rental);
    }

    public void removeRental(Rental rental) {
        rentals.remove(rental);
    }

    public void addStore(Store store) {
        stores.add(store);
    }

    public void removeStore(Store store) {
        stores.remove(store);
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<DailyLog> getDailyLogs() {
        return dailyLogs;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public List<Store> getStores() {
        return stores;
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
