package me.groszewicz;

import java.util.Scanner;

public class App {
    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            CalculatorDataSource source = new CalculatorDataSource();
            CalculatorEngine engine = new CalculatorEngine(source);
            CalculatorScreen screen = new CalculatorScreen(engine);

            screen.run(scanner);
        }
    }
}
