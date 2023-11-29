package com.example.parser.interpreter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversionHelper {
    public static Object convertBigDecimal(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(bigDecimal.setScale(0, RoundingMode.DOWN)) == 0) {
            return bigDecimal.intValueExact();
        } else {
            return bigDecimal.doubleValue();
        }
    }
}
