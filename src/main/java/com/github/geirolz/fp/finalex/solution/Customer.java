package com.github.geirolz.fp.finalex.solution;

import java.util.List;
import java.util.Optional;

public class Customer {
    private final List<Order> orders;

    public Customer(List<Order> orders) {
        this.orders = orders;
    }

    public Optional<Order> findOrderById(String orderId) {
        return this.orders.stream().filter(o -> orderId.equals(o.getId())).findFirst();
    }
}
