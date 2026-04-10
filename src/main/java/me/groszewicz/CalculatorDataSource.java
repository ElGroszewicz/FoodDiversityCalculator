package me.groszewicz;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class CalculatorDataSource {

    private int size = 32; //default
    private BigDecimal[] data;

    public CalculatorDataSource() {
        load();
        normalize();
    }

    public BigDecimal[] getData() {
        return data; //Returned array should not be mutated
    }

    public void load() {
        try (Stream<String> lines = Files.lines(Path.of("data.txt"))) {
            data = lines
                    .map(String::trim)
                    .filter(line -> !line.isEmpty())
                    .map(BigDecimal::new)
                    .sorted()
                    .toArray(BigDecimal[]::new);

        } catch (IOException e) {
            throw new RuntimeException("Failure loading data file", e);
        }
    }

    public void normalize() {
        if (data.length == size) {
            return;
        }

        if (data.length > size) {
            System.out.println((data.length - size) + " lowest values beyond queue size of " + size + " will be ignored.");

            int start = data.length - size;
            data = Arrays.copyOfRange(data, start, data.length);
            return;
        }

        BigDecimal[] normalized = Arrays.copyOf(data, size);

        for (int i = data.length; i < size; i++) {
            normalized[i] = BigDecimal.ZERO;
        }

        data = normalized;
    }
}
