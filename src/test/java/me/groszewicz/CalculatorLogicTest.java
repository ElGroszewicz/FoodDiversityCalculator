package me.groszewicz;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorLogicTest {

    @Test
    void calculateKnownFV() {
        final BigDecimal[] testFoodArray = {
                new BigDecimal("4.33"), new BigDecimal("4.33"), new BigDecimal("4.33"), new BigDecimal("4.33"),
                new BigDecimal("4.33"), new BigDecimal("4.33"), new BigDecimal("4.33"), new BigDecimal("4.33"),
                new BigDecimal("4.61"),
                new BigDecimal("4.67"), new BigDecimal("4.67"), new BigDecimal("4.67"), new BigDecimal("4.67"),
                new BigDecimal("4.67"), new BigDecimal("4.67"), new BigDecimal("4.67"), new BigDecimal("4.67"),
                new BigDecimal("4.74"),
                new BigDecimal("4.82"),
                new BigDecimal("5.0"), new BigDecimal("5.0"), new BigDecimal("5.0"), new BigDecimal("5.0"),
                new BigDecimal("5.17"),
                new BigDecimal("5.7"), new BigDecimal("5.7"),
                new BigDecimal("5.82"),
                new BigDecimal("6.0"),
                new BigDecimal("6.02"),
                new BigDecimal("6.45"),
                new BigDecimal("7.74"),
                new BigDecimal("10.0")
        };
        BigDecimal result = CalculatorLogic.calculateFoodVariety(testFoodArray);
        assertEquals(BigDecimal.valueOf(93.02), result);
    }
}