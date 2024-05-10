package com.atduyar.rental.Domain.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Catalog {
    private String name;
    private List<Title> titles;

    public Catalog(String name, List<Title> titles) {
        this.name = name;
        this.titles = titles;
    }
    public Catalog(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public void removeTitle(Title title) {
        titles.remove(title);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Title> getTitles() {
        return titles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Catalog catalog = (Catalog) o;
        return Objects.equals(name, catalog.name) && Objects.equals(titles, catalog.titles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, titles);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Catalog{" +
                "name='" + name + '\'' +
                ", titles=" + titles +
                '}';
    }
}
