/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestDivision {

    @Test
    public void testDivisionTCD01() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.division(10, 2), 0.01);
    }

    @Test
    public void testDivisionTCD02() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.division(10, 0), 0.01);
    }

    @Test
    public void testDivisionTCD03() {
        Calculadora calc = new Calculadora();
        assertEquals(-5, calc.division(-10, 2), 0.01);
    }

    @Test
    public void testDivisionTCD04() {
        Calculadora calc = new Calculadora();
        assertEquals(-5, calc.division(10, -2), 0.01);
    }

    @Test
    public void testDivisionTCD05() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.division(-10, -2), 0.01);
    }

    @Test
    public void testDivisionTCD06() {
        Calculadora calc = new Calculadora();
        assertEquals(1.90909090909, calc.division(10.5, 5.5), 0.00000000001);
    }

    @Test
    public void testDivisionTCD07() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.division(10.5, 0.0), 0.01);
    }

    @Test
    public void testDivisionTCD08() {
        Calculadora calc = new Calculadora();
        assertEquals(-1.90909090909, calc.division(-10.5, 5.5), 0.00000000001);
    }

    @Test
    public void testDivisionTCD09() {
        Calculadora calc = new Calculadora();
        assertEquals(-1.90909090909, calc.division(10.5, -5.5), 0.00000000001);
    }

    @Test
    public void testDivisionTCD10() {
        Calculadora calc = new Calculadora();
        assertEquals(1.90909090909, calc.division(-10.5, -5.5), 0.00000000001);
    }

    @Test
    public void testDivisionTCD11() {
        Calculadora calc = new Calculadora();
        assertEquals(1.81818181818, calc.division(10, 5.5), 0.00000000001);
    }

    @Test
    public void testDivisionTCD12() {
        Calculadora calc = new Calculadora();
        assertEquals(2.1, calc.division(10.5, 5), 0.01);
    }

    @Test
    public void testDivisionTCD13() {
        Calculadora calc = new Calculadora();
        assertEquals(-1.81818181818, calc.division(-10, 5.5), 0.00000000001);
    }

    @Test
    public void testDivisionTCD14() {
        Calculadora calc = new Calculadora();
        assertEquals(-2.1, calc.division(10.5, -5), 0.01);
    }

    @Test
    public void testDivisionTCD15() {
        Calculadora calc = new Calculadora();
        assertEquals(2.1, calc.division(-10.5, -5), 0.01);
    }
}
