package com.atduyar.rental.Domain.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private String name;
    private String phone;
    private String location;
    private String manager;
    private List<Item> stocks;

    public Store(String name, String phone, String location, String manager) {
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.manager = manager;
        this.stocks = new ArrayList<>();
    }
    public void storeItem(Item item){
        stocks.add(item);
    }

    public void removeItem(Item item){
        stocks.remove(item);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public List<Item> getStocks() {
        return stocks;
    }

    public void setStocks(List<Item> stocks) {
        this.stocks = stocks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Store store = (Store) o;
        return Objects.equals(name, store.name) && Objects.equals(phone, store.phone)
                && Objects.equals(location, store.location) && Objects.equals(manager, store.manager)
                && Objects.equals(stocks, store.stocks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, location, manager, stocks);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Store{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", manager='" + manager + '\'' +
                ", items=" + stocks +
                '}';
    }
}
