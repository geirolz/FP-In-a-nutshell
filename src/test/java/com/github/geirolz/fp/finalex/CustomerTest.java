package com.github.geirolz.fp.finalex;

import com.github.geirolz.fp.finalex.exercise.Customer;
import com.github.geirolz.fp.finalex.exercise.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomerTest {
    @Test
    public void findOrderNotFound() {
        final Customer customer = new Customer(Arrays.asList(
                new Order("order1", Collections.emptyList()),
                new Order("order3", Collections.emptyList())
        ));

        assertFalse(customer.findOrderById("order2").isPresent());
    }

    @Test
    public void findOrderFound() {
        final Customer customer = new Customer(Arrays.asList(
                new Order("order1", Collections.emptyList()),
                new Order("order2", Collections.emptyList()),
                new Order("order3", Collections.emptyList())
        ));

        assertTrue(customer.findOrderById("order2").isPresent());
    }

}