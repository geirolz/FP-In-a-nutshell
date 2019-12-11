package com.github.geirolz.fp.finalex;

import com.github.geirolz.fp.finalex.exercise.Item;
import com.github.geirolz.fp.finalex.exercise.Order;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    public void totalOrderWithoutItems() {
        final Order order = new Order("orderId", Collections.emptyList());
        assertEquals(order.totalOrder(), BigDecimal.ZERO);
    }

    @Test
    public void totalOrderWithItems() {
        final Order order = new Order("orderId", Arrays.asList(
                new Item(new BigDecimal(10), Optional.empty()),
                new Item(new BigDecimal(5), Optional.empty())
        ));

        assertEquals(order.totalOrder(), new BigDecimal(15));
    }
}