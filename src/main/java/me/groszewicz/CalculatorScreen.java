package me.groszewicz;

import java.util.Scanner;

public class CalculatorScreen {

    private final CalculatorEngine engine;

    public CalculatorScreen(CalculatorEngine engine) {
        this.engine = engine;
    }

    public void run(Scanner scanner) {
        showHelp();
        while (true) {
            String input = readInput(scanner);
            ParsedInput userInput = parseInput(input);
            if (userInput instanceof ExitInput) {
                return;
            }
            handleParsedInput(userInput);
        }
    }

    private String readInput(Scanner scanner) {
        return scanner.nextLine().trim();
    }

    private ParsedInput parseInput(String input) {
        if (input.equalsIgnoreCase("exit")) {
            return new ExitInput();
        }
        // try {
        //     BigDecimal number = new BigDecimal(input);
        //     return new NumberInput(number);
        // } catch (NumberFormatException ignored) {}
        return new MenuInput(input.toLowerCase());
    }

    private void handleParsedInput(ParsedInput userInput) {
        switch (userInput) {
            //case NumberInput n -> System.out.println("Direct number handling not built yet."); //call CalculatorEngine methods
            case MenuInput m -> handleMenuInput(m);
            case ExitInput ignored -> throw new IllegalStateException("ExitInput reached handler unexpectedly"); //Exit is handled in run()
        }
    }

    private void handleMenuInput(MenuInput command) {
        switch (command.value()) {
            case "help" -> showHelp();
            case "reload" -> {
                engine.load();
                System.out.println("Current values result in Food Diversity of: " + engine.calculate());
            }
        }
    }

    private void showHelp() {
        System.out.println("Enter \"reload\" to load and calculate values, or \"exit\" to quit.");
    }
}
