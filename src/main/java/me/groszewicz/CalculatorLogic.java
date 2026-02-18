package me.groszewicz;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class CalculatorLogic {
    private CalculatorLogic() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static BigDecimal calculateFoodVariety(BigDecimal[] foodArray) {
        BigDecimal result = BigDecimal.ZERO;

        int queueSize = foodArray.length;
        BigDecimal bdQueueSize = BigDecimal.valueOf(queueSize);

        for (int i = 1; i <= queueSize; i++) {
            BigDecimal realDiversity = foodArray[i - 1]
                    .multiply(BigDecimal.valueOf(i)
                    .divide(bdQueueSize, 10, RoundingMode.HALF_UP)); //TODO: Find scale used in mod calculations
            result = result.add(realDiversity);
        }
        return result.setScale(2, RoundingMode.HALF_UP);
    }
}
