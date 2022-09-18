package com.epam.rd.autotasks;

public class Factorial {
    public String factorial(String n) {
        if (n == null) {
            throw new IllegalArgumentException();
        }
        long num;
        try {
            num = Integer.parseInt(n);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        return String.format("%d", doFactorial(num));
    }

    private static long doFactorial(long num) {
        if (num == 0) {
            return 1L;
        }
        long factorial = 1;
        while (num != 1) {
            factorial *= num;
            num--;
        }
        return factorial;
    }
}
