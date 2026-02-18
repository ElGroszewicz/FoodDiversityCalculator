package me.groszewicz;

public class CalculatorEngine {

    private final CalculatorDataSource source;

    public CalculatorEngine(CalculatorDataSource source) {
        this.source = source;
    }

    public void load() {
        source.load();
    }
}
