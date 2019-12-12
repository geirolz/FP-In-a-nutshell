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
        return items.stream()
                .map(Item::totalItem)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
