package com.atduyar.rental.Domain.Entity.Strategies;

public class PercantageDiscount implements IPriceStrategy{
    /**
     * between 0 to 1.
     */
    private double percantage;

    public PercantageDiscount(double percantage) {
        this.percantage = percantage;
    }

    @Override
    public double getPrice(double price) {
        return price - (price * percantage);
    }
}
