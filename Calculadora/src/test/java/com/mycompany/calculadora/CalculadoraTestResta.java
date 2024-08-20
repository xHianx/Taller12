/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestResta {

    @Test
    public void testRestaTCR01() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.resta(-1, -5), 0.01);
    }

    @Test
    public void testRestaTCR02() {
        Calculadora calc = new Calculadora();
        assertEquals(-4, calc.resta(-5, -1), 0.01);
    }

    @Test
    public void testRestaTCR03() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.resta(8, 5), 0.01);
    }

    @Test
    public void testRestaTCR04() {
        Calculadora calc = new Calculadora();
        assertEquals(-3, calc.resta(5, 8), 0.01);
    }

    @Test
    public void testRestaTCR05() {
        Calculadora calc = new Calculadora();
        assertEquals(-13, calc.resta(-5, 8), 0.01);
    }

    @Test
    public void testRestaTCR06() {
        Calculadora calc = new Calculadora();
        assertEquals(13, calc.resta(8, -5), 0.01);
    }

    @Test
    public void testRestaTCR07() {
        Calculadora calc = new Calculadora();
        assertEquals(10, calc.resta(5, -5), 0.01);
    }

    @Test
    public void testRestaTCR08() {
        Calculadora calc = new Calculadora();
        assertEquals(5.0, calc.resta(10.5, 5.5), 0.01);
    }

    @Test
    public void testRestaTCR09() {
        Calculadora calc = new Calculadora();
        assertEquals(-5.0, calc.resta(5.5, 10.5), 0.01);
    }

    @Test
    public void testRestaTCR10() {
        Calculadora calc = new Calculadora();
        assertEquals(5.0, calc.resta(-5.5, -10.5), 0.01);
    }

    @Test
    public void testRestaTCR11() {
        Calculadora calc = new Calculadora();
        assertEquals(-16.0, calc.resta(-10.5, 5.5), 0.01);
    }

    @Test
    public void testRestaTCR12() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.resta(5.0, 5.0), 0.01);
    }

    @Test
    public void testRestaTCR13() {
        Calculadora calc = new Calculadora();
        assertEquals(4.5, calc.resta(10, 5.5), 0.01);
    }

    @Test
    public void testRestaTCR14() {
        Calculadora calc = new Calculadora();
        assertEquals(-4.5, calc.resta(5.5, 10), 0.01);
    }

    @Test
    public void testRestaTCR15() {
        Calculadora calc = new Calculadora();
        assertEquals(-15.5, calc.resta(-5, 10.5), 0.01);
    }

    @Test
    public void testRestaTCR16() {
        Calculadora calc = new Calculadora();
        assertEquals(-15.5, calc.resta(-10.5, 5), 0.01);
    }

    @Test
    public void testRestaTCR17() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.resta(5, 5.0), 0.01);
    }
}