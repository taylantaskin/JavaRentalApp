package com.atduyar.rental;

import com.atduyar.rental.Domain.Entity.Game;
import com.atduyar.rental.Domain.Entity.Item;
import com.atduyar.rental.Domain.Entity.Member;
import com.atduyar.rental.Domain.Entity.Music;
import com.atduyar.rental.Domain.Entity.Rental;
import com.atduyar.rental.Domain.Entity.Store;
import com.atduyar.rental.Domain.Entity.Title;
import com.atduyar.rental.Domain.Enums.TitleType;

public class App {
    public static void main(String[] args) {
        Title god = new Game("godofwar", "action game", 1, TitleType.NEW_RELEASE, "SONY", 2022);
        Title moz = new Music(2, "Mozart", "clasic", TitleType.NORMAL, "NONE", "Mozart", 3000, 13);
        Item game1 = new Item(1114, god);
        Item game2 = new Item(1115, god);
        Item game3 = new Item(1116, god);
        Item music1 = new Item(1117, moz);
        Item music2 = new Item(1118, moz);
        Item music3 = new Item(1119, moz);

        System.out.println(game1.getPrice());
        System.out.println(game1.getRentalDuration());

        Store store = new Store("aralgame", "90554", "bosna", "Taylan");
        Member member = new Member(1L, "Ahmet", "ılıca", "90535");

        Rental rental = new Rental(member, store);
        rental.addItem(game1);
        rental.addItem(game2);
        rental.addItem(music1);
        rental.addItem(music2);
        rental.complete();
        System.out.println(rental);
    }
}
