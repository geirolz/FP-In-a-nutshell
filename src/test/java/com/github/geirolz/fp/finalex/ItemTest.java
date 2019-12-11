package com.github.geirolz.fp.finalex;

import com.github.geirolz.fp.finalex.exercise.Item;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {
    @Test
    public void withoutDiscount() {
        final Item item = new Item(new BigDecimal(10), Optional.empty());
        assertEquals(item.totalItem(), new BigDecimal(10));
    }

    @Test
    public void withDiscount() {
        final Item item = new Item(new BigDecimal(10), Optional.of(new BigDecimal(1)));
        assertEquals(item.totalItem(), new BigDecimal(9));
    }
}