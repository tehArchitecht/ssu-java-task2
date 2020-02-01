package com.tehArchitecht.task2;

public class ProperFraction {
    int numerator;
    int denominator;

    public ProperFraction() {
        numerator = 1;
        denominator = 2;
    }

    public ProperFraction(int numerator, int denominator) throws IllegalArgumentException {
        if (Math.abs(numerator) >= Math.abs(denominator))
            throw new IllegalArgumentException("The numerator must have a lower absolute value than the denominator");

        this.numerator = numerator;
        this.denominator = denominator;
    }

    private static int sumOfDigits(int num) {
        num = Math.abs(num);
        int sum = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
        }
        return sum;
    }

    // Not sure what converting a fraction to a percentage means, so I'm providing a toDouble as well.
    public double toDouble() {
        return ((double) numerator)/denominator;
    }

    public String toPercentage() {
        double value = toDouble();
        // Could take the absolute value here, unsure what to do.
        return String.format("%.0f", value*100.0) + "%";
    }

    public int sumOfDigits() {
        return sumOfDigits(numerator) + sumOfDigits(denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
