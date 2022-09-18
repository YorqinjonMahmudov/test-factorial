package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testRegularInput(){
        Assertions.assertEquals("6227020800", factorial.factorial("13"));
        Assertions.assertEquals("87178291200", factorial.factorial("14"));
        Assertions.assertEquals("1307674368000", factorial.factorial("15"));
    }

}
