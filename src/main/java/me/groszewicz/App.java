package me.groszewicz;

import me.groszewicz.screens.MainMenuScreen;

import java.util.Scanner;

public class App {

    Scanner scanner = null;
    Screen currentScreen;

    public App() {
        currentScreen = null;
    }

    public void run() {
        try{
            scanner = new Scanner(System.in);
            currentScreen = new MainMenuScreen();

            while (!currentScreen.isTerminal()) {
                currentScreen = currentScreen.execute(scanner);
            }

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }


    }
}
