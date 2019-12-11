package com.github.geirolz.fp.finalex.exercise;

import java.math.BigDecimal;
import java.util.Optional;

public class Item {
    private final BigDecimal unitPrice;
    private final Optional<BigDecimal> discount;

    public Item(BigDecimal unitPrice, Optional<BigDecimal> discount) {
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public BigDecimal totalItem() {
        if(discount.isPresent())
            return unitPrice.subtract(discount.get());

        return unitPrice;
    }
}
