package com.atduyar.rental.Domain.Entity.Strategies;

public class NormalStrategy implements IPriceStrategy{
    @Override
    public double getPrice(double price) {
        return price;
    }
}
