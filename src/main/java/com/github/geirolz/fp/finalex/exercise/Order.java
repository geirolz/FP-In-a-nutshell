package com.github.geirolz.fp.finalex.exercise;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private final String id;
    private final List<Item> items;

    public Order(String id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public BigDecimal totalOrder() {
        BigDecimal total = BigDecimal.ZERO;

        for(int i=1; i<items.size(); i++) {
            final BigDecimal totalItem = items.get(i).totalItem();
            total = total.add(totalItem);
        }

        return total;
    }
}
