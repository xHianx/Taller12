/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestExponenciacion {

    @Test
    public void testExponenciacionTCR01() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.exponenciacion(2, 3), 0.01);
    }

    @Test
    public void testExponenciacionTCR02() {
        Calculadora calc = new Calculadora();
        assertEquals(-8, calc.exponenciacion(-2, 3), 0.01);
    }

    @Test
    public void testExponenciacionTCR03() {
        Calculadora calc = new Calculadora();
        assertEquals(16, calc.exponenciacion(-2, 4), 0.01);
    }

    @Test
    public void testExponenciacionTCR04() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.exponenciacion(2, 0), 0.01);
    }

    @Test
    public void testExponenciacionTCR05() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.exponenciacion(0, 5), 0.01);
    }
}