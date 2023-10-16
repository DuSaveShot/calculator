package com.example.calculator;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {

        int a, b, sum1, sum2, sum3, sum4;
        a = 5;
        b = 5;

        sum1 = a + b;
        sum2 = a - b;
        sum3 = a * b;
        sum4 = a / b;

        Assertions.assertEquals(10,sum1);
        Assertions.assertEquals(0,sum2);
        Assertions.assertEquals(25,sum3);
        Assertions.assertEquals(0,sum4);

    }

    @org.junit.jupiter.api.Test
    void main2() {

        int a, b, sum2;
        a = 5;
        b = 5;

        sum2 = a - b;

        Assertions.assertEquals(0,sum2);
    }

    @org.junit.jupiter.api.Test
    void main3() {

        int a, b, sum3;
        a = 5;
        b = 5;

        sum3 = a * b;

        Assertions.assertEquals(25,sum3);
    }
    @org.junit.jupiter.api.Test
    void main4() {

        int a, b, sum4;
        a = 5;
        b = 5;

        sum4 = a / b;

        Assertions.assertEquals(1,sum4);
    }

    @org.junit.jupiter.api.Test
    void main5() {

        int a, b, sum2;
        a = 5;
        b = 5;

        sum2 = a + b;

        Assertions.assertEquals(10,sum2);
    }

}