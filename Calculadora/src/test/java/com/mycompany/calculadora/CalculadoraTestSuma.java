/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestSuma {

    @Test
    public void testSumaTCS01() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.suma(5, 10));
    }

    @Test
    public void testSumaTCS02() {
        Calculadora calc = new Calculadora();
        assertEquals(-5, calc.suma(5, -10));
    }

    @Test
    public void testSumaTCS03() {
        Calculadora calc = new Calculadora();
        assertEquals(-15, calc.suma(-5, -10));
    }

    @Test
    public void testSumaTCS04() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.suma(-5, 5));
    }

    @Test
    public void testSumaTCS05() {
        Calculadora calc = new Calculadora();
        assertEquals(15.7, calc.suma(5.5, 10.2), 0.01);
    }

    @Test
    public void testSumaTCS06() {
        Calculadora calc = new Calculadora();
        assertEquals(-5.0, calc.suma(5.3, -10.3), 0.01);
    }

    @Test
    public void testSumaTCS07() {
        Calculadora calc = new Calculadora();
        assertEquals(5.0, calc.suma(-5.5, 10.5), 0.01);
    }

    @Test
    public void testSumaTCS08() {
        Calculadora calc = new Calculadora();
        assertEquals(-15.9, calc.suma(-5.7, -10.2), 0.01);
    }

    @Test
    public void testSumaTCS09() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.suma(-5.0, 5.0), 0.01);
    }

    @Test
    public void testSumaTCS10() {
        Calculadora calc = new Calculadora();
        assertEquals(15.2, calc.suma(5, 10.2), 0.01);
    }

    @Test
    public void testSumaTCS11() {
        Calculadora calc = new Calculadora();
        assertEquals(-4.5, calc.suma(5.5, -10), 0.01);
    }

    @Test
    public void testSumaTCS12() {
        Calculadora calc = new Calculadora();
        assertEquals(5.5, calc.suma(-5, 10.5), 0.01);
    }

    @Test
    public void testSumaTCS13() {
        Calculadora calc = new Calculadora();
        assertEquals(-15.5, calc.suma(-5.5, -10), 0.01);
    }

    @Test
    public void testSumaTCS14() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.suma(-5, 5.0), 0.01);
    }
}
