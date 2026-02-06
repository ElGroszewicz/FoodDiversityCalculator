package me.groszewicz.screens;

import me.groszewicz.Screen;

import java.util.Scanner;

public final class ExitScreen implements Screen {
    @Override
    public boolean isTerminal(){
        return true;
    }

    @Override
    public Screen execute(Scanner scanner) {
        return this;
    }
}
