package com.atduyar.rental.Domain.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private String name;
    private String phone;
    private String location;
    private String manager;
    List<Item> items;

    public Store(String name, String phone, String location, String manager) {
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.manager = manager;
        this.items = new ArrayList<>();
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
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
                && Objects.equals(items, store.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, location, manager, items);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Store{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", manager='" + manager + '\'' +
                ", items=" + items +
                '}';
    }
}
