package me.groszewicz;

import java.util.Scanner;

public class App {

    Scanner scanner = null;

    public void run() {
        try{
            scanner = new Scanner(System.in);
            new CalculatorScreen().run(scanner);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
