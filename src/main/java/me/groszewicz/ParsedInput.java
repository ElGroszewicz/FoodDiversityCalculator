package me.groszewicz;

import java.math.BigDecimal;

public sealed interface ParsedInput
        permits ExitInput, MenuInput, NumberInput {
}

record ExitInput() implements ParsedInput {}

record MenuInput(String value) implements ParsedInput {}

record NumberInput(BigDecimal value) implements ParsedInput {}
