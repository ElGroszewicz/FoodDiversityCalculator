package me.groszewicz.screens;

import me.groszewicz.Screen;

import java.util.Scanner;

public class MainMenuScreen implements Screen {

    public MainMenuScreen() {
    }

    @Override
    public Screen execute(Scanner scanner) {
        showOptions();
        String choice = readChoice(scanner);
        return nextScreenFor(choice);
    }

    private void showOptions() {
        System.out.println("Enter 0 to quit");
    }

    private String readChoice(Scanner scanner) {
        return scanner.nextLine().trim();
    }

    private Screen nextScreenFor(String choice) {
        return switch (choice) {
            case "0" -> new ExitScreen(); //quit
            default -> {
                System.out.println("Invalid option.");
                yield this;
            }
        };
    }
}
