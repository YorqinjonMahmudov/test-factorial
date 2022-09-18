package com.epam.rd.autotasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void factorialHappyTest(){
        Assertions.assertEquals("1", factorial.factorial("0"));
    }

}
