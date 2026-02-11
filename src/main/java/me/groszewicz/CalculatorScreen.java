package me.groszewicz;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorScreen {

    public void run(Scanner scanner) {
        showOptions();
        while (true) {
            String input = readInput(scanner);
            ParsedInput choice = parseInput(input);
            if (choice instanceof ExitInput) {
                return;
            }
            handleParsedInput(choice);
        }
    }

    private void showOptions() {
        System.out.println("Enter \"exit\" to quit.");
    }

    private String readInput(Scanner scanner) {
        return scanner.nextLine().trim();
    }

    private ParsedInput parseInput(String input) {
        if (input.equalsIgnoreCase("exit")) {
            return new ExitInput();
        }
        try {
            BigDecimal number = new BigDecimal(input);
            return new NumberInput(number);
        } catch (NumberFormatException ignored) {}

    return new MenuInput(input.toLowerCase());
    }

    private void handleParsedInput(ParsedInput choice) {
        switch (choice) {
            case NumberInput n -> System.out.println("Number handling not built yet."); //call CalculatorEngine methods
            case MenuInput m -> System.out.println("Command handling not built yet."); //command handling
            case ExitInput ignored -> throw new IllegalStateException("ExitInput reached handler unexpectedly"); //Exit is handled in run()
        };
    }
}
