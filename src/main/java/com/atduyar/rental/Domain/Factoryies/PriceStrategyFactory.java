package com.atduyar.rental.Domain.Factoryies;

import com.atduyar.rental.Domain.Entity.Strategies.AbsoluteDiscountStrategy;
import com.atduyar.rental.Domain.Entity.Strategies.IPriceStrategy;
import com.atduyar.rental.Domain.Entity.Strategies.NormalStrategy;
import com.atduyar.rental.Domain.Entity.Strategies.PercantageDiscount;

import java.util.Date;

public class PriceStrategyFactory {
    public static IPriceStrategy createPriceStrategy() {
        Date d = new Date();
        if (d.getDay() == 0 || d.getDay() == 5) {
            return new AbsoluteDiscountStrategy(10,100);
        } else if (d.getDay()==6){
            return new PercantageDiscount(0.5);
        }else {
            return new NormalStrategy();
        }

    }
}
