package com.atduyar.rental.Domain.Entity.Strategies;

public class AbsoluteDiscountStrategy implements IPriceStrategy {
    private double discount;
        private double threshold;

    public AbsoluteDiscountStrategy(double discount, double threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    @Override
    public double getPrice(double price) {
        if (threshold > price)
            return price;
        else
            return price - discount;
    }
}
