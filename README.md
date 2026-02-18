# FoodDiversityCalculator

CLI-based Java application to calculate Food Diversity values for the Spice of Life (Minecraft mod).

The project focuses on usability, structured input parsing, separation of concerns, and modular architecture.

## Motivation

In large and frequently updated modpacks, scouring the JEI item list for foods worth the effort can be tedious and unreliable.
Limited guide availability forces players into time-consuming trial-and-error or abandoning the mechanic altogether.

This project spares you tedious research and calculation (or expensive mistakes) by extracting item values from a text document and using the following formula:

S = Σ (aᵢ · (N - i) / N), for i = 0 to N-1

Where:
- N = user-defined constant (e.g., 32)
- aᵢ = Food Diversity value of the i-th food item (sorted from highest to lowest value)
- i ∈ \{0, 1, 2, ..., N - 1\}

## Current Features

- Interactive CLI loop (`CalculatorScreen`)
- Sealed input hierarchy (`ParsedInput`)
  - `NumberInput`
  - `MenuInput`
  - `ExitInput`
- BigDecimal-based numeric parsing
- Structured control flow separation
- Text file parsing for contextual values

## Architecture Overview

The application separates concerns into:

- Input parsing layer (sealed hierarchy)
- Control flow management (`CalculatorScreen`)
- Calculation engine (planned modular integration)
- External data loading via `.txt` file

This structure avoids mixing parsing logic with domain computation.

## Technologies

- Java
- BigDecimal for numeric precision
- Git for version control

## Planned Improvements

- Full calculation engine implementation
- Configurable parameters to support non-standard mod configuration
- Persistent update of values through CLI
- Built-in item list (maybe)
- Automatic item list generation from game files (maybe²)

## Running the Project

Compile and run using:

javac Main.java

java Main
