package com.github.geirolz.fp.finalex.exercise;

import java.util.List;
import java.util.Optional;

public class Customer {
    private final List<Order> orders;

    public Customer(List<Order> orders) {
        this.orders = orders;
    }

    public Optional<Order> findOrderById(String orderId) {
        for(int i=0; i<=orders.size(); i++)
            if(orderId.equals(orders.get(i).getId()))
                return Optional.of(orders.get(i));

        return Optional.empty();
    }
}
