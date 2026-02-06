package me.groszewicz;

import java.util.Scanner;

public interface Screen {
    Screen execute(Scanner scanner);

    default boolean isTerminal() {
        return false;
    }
}
