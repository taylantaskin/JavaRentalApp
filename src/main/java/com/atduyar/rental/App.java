package com.atduyar.rental;

import com.atduyar.rental.Domain.Entity.*;
import com.atduyar.rental.Domain.Enums.TitleType;

public class App {
    public static void main(String[] args) {
        SuperRent superRent =new SuperRent();
        Store store = new Store("aralgame", "90554", "bosna", "Taylan");
        Catalog catalog = new Catalog("Summer Catalaog");
        superRent.addStore(store);

        Member member = new Member(1L, "Ahmet", "ılıca", "90535");
        superRent.addMember(member);

        Title god = new Game("god of war", "action game", 1, TitleType.NEW_RELEASE, "SONY", 2022);
        catalog.addTitle(god);
        Title moz = new Music(2, "Mozart", "clasic", TitleType.NORMAL, "NONE", "Mozart", 3000, 13);
        catalog.addTitle(moz);
        superRent.setCatalog(catalog);

        Item game1 = new Item(1114, god);
        store.storeItem(game1);
        Item game2 = new Item(1115, god);
        store.storeItem(game2);
        Item game3 = new Item(1116, god);
        store.storeItem(game3);
        Item music1 = new Item(1117, moz);
        store.storeItem(music1);
        Item music2 = new Item(1118, moz);
        store.storeItem(music2);
        Item music3 = new Item(1119, moz);
        store.storeItem(music3);


        System.out.println(game1.getPrice());
        System.out.println(music1.getPrice());


        Rental rental = new Rental(member, store);
        rental.addItem(game1);
        rental.addItem(music1);
        System.out.println(rental.getPrice());
        rental.complete();
        superRent.addRental(rental);

        Rental rental1 = new Rental(member, store);
        rental1.addItem(game2);
        rental1.complete();
        superRent.addRental(rental1);

        System.out.println(rental);
    }
}
