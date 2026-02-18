package me.groszewicz;

import java.math.BigDecimal;
import java.util.Arrays;

public class CalculatorDataSource {

    private BigDecimal[] data;
    private final String[] placeholder = { //Will be replaced by text file
            "10.0", "7.74", "6.45", "6.02", "6.0", "5.82", "5.7", "5.7",
            "5.17", "5.0", "5.0", "5.0", "5.0", "4.82", "4.74",
            "4.67", "4.67", "4.67", "4.67", "4.67", "4.67", "4.67", "4.67",
            "4.61",
            "4.33", "4.33", "4.33", "4.33", "4.33", "4.33", "4.33", "4.33"
    };

    public CalculatorDataSource() {
        load();
    }

    public BigDecimal[] getData() {
        return data;
    }

    public void load() {
        data = Arrays.stream(placeholder)
                .map(BigDecimal::new)
                .sorted()
                .toArray(BigDecimal[]::new)
        ;
    }
}
