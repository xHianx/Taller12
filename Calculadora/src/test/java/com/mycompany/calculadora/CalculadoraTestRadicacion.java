/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestRadicacion {

    @Test
    public void testRadicacionTCR01() {
        Calculadora calc = new Calculadora();
        assertEquals(4, calc.radicacion(16, 2), 0.01);
    }

    @Test
    public void testRadicacionTCR02() {
        Calculadora calc = new Calculadora();
        assertEquals(3, calc.radicacion(27, 3), 0.01);
    }

    @Test
    public void testRadicacionTCR03() {
        Calculadora calc = new Calculadora();
        assertEquals(-2, calc.radicacion(-8, 3), 0.01);
    }

    @Test
    public void testRadicacionTCR04() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.radicacion(-8, 2), 0.01);
    }

    @Test
    public void testRadicacionTCR05() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.radicacion(0, 3), 0.01);
    }
}