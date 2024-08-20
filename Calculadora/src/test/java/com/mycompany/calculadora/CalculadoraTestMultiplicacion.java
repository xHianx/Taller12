/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestMultiplicacion {

    @Test
    public void testMultiplicacionTCM01() {
        Calculadora calc = new Calculadora();
        assertEquals(-24, calc.multiplicacion(6, -4), 0.01);
    }

    @Test
    public void testMultiplicacionTCM02() {
        Calculadora calc = new Calculadora();
        assertEquals(24, calc.multiplicacion(4, 6), 0.01);
    }

    @Test
    public void testMultiplicacionTCM03() {
        Calculadora calc = new Calculadora();
        assertEquals(24, calc.multiplicacion(-4, -6), 0.01);
    }

    @Test
    public void testMultiplicacionTCM04() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.multiplicacion(2, 1), 0.01);
    }

    @Test
    public void testMultiplicacionTCM05() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.multiplicacion(5, 0), 0.01);
    }

    @Test
    public void testMultiplicacionTCM06() {
        Calculadora calc = new Calculadora();
        assertEquals(57.75, calc.multiplicacion(10.5, 5.5), 0.01);
    }

    @Test
    public void testMultiplicacionTCM07() {
        Calculadora calc = new Calculadora();
        assertEquals(-57.75, calc.multiplicacion(5.5, -10.5), 0.01);
    }

    @Test
    public void testMultiplicacionTCM08() {
        Calculadora calc = new Calculadora();
        assertEquals(57.75, calc.multiplicacion(-5.5, -10.5), 0.01);
    }

    @Test
    public void testMultiplicacionTCM09() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.multiplicacion(0.0, 10.5), 0.01);
    }

    @Test
    public void testMultiplicacionTCM10() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.multiplicacion(-5.5, 0.0), 0.01);
    }

    @Test
    public void testMultiplicacionTCM11() {
        Calculadora calc = new Calculadora();
        assertEquals(55.0, calc.multiplicacion(10, 5.5), 0.01);
    }

    @Test
    public void testMultiplicacionTCM12() {
        Calculadora calc = new Calculadora();
        assertEquals(-55.0, calc.multiplicacion(5.5, -10), 0.01);
    }

    @Test
    public void testMultiplicacionTCM13() {
        Calculadora calc = new Calculadora();
        assertEquals(52.5, calc.multiplicacion(-5, -10.5), 0.01);
    }

    @Test
    public void testMultiplicacionTCM14() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.multiplicacion(0, 10.5), 0.01);
    }

    @Test
    public void testMultiplicacionTCM15() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.multiplicacion(-5, 0.0), 0.01);
    }
}

