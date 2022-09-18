package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
        Assertions.assertThrows(NumberFormatException.class,
                () -> factorial.factorial(null)
                );
    }

    @Test
    void testNegativeInput(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> factorial.factorial(null)
        );
    }

    @Test
    void testFractionalInput(){
        Assertions.assertThrows(NumberFormatException.class,
                () -> factorial.factorial("4.3")
        );
    }

    @Test
    void testNonDigitalInput(){
        Assertions.assertThrows(NumberFormatException.class,
                () -> factorial.factorial("s")
        );
    }


}
