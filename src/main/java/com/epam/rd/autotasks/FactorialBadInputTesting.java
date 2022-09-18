package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial(null);
        });
    }

    @Test
    void testNegativeInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial("-3");
        });
    }

    @Test
    void testFractionalInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial("2.5");
        });
    }

    @Test
    void testNonDigitalInput(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            factorial.factorial("sardor");
        });
    }


}
