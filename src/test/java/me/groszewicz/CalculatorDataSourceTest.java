package me.groszewicz;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorDataSourceTest {

    @Test
    void dataIsLoadedOnConstruction() {
        CalculatorDataSource source = new CalculatorDataSource();

        BigDecimal[] data = source.getData();

        assertNotNull(data);
        assertTrue(data.length > 0);
    }

    @Test
    void dataIsSortedAscending() {
        CalculatorDataSource source = new CalculatorDataSource();
        BigDecimal[] data = source.getData();

        for (int i = 1; i < data.length; i++) {
            assertTrue(data[i - 1].compareTo(data[i]) <= 0);
        }
    }
}