package me.groszewicz;

import java.math.BigDecimal;

public class CalculatorEngine {

    private final CalculatorDataSource source;

    public CalculatorEngine(CalculatorDataSource source) {
        this.source = source;
    }

    public void load() {
        source.load();
    }

    public BigDecimal calculate() {
        return CalculatorLogic.calculateFoodVariety(source.getData());
    }
}
