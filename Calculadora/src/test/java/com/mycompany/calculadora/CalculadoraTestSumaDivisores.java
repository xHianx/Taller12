/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTestSumaDivisores {
    
    @Test
    public void testSumaDivisoresTCR01() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.sumaDivisores(6));
    }

    @Test
    public void testSumaDivisoresTCR02() {
        Calculadora calc = new Calculadora();
        assertEquals(16, calc.sumaDivisores(12));
    }

    @Test
    public void testSumaDivisoresTCR03() {
        Calculadora calc = new Calculadora();
        assertEquals(28, calc.sumaDivisores(28));
    }

    @Test
    public void testSumaDivisoresTCR04() {
        Calculadora calc = new Calculadora();
        assertEquals(9, calc.sumaDivisores(15));
    }

    @Test
    public void testSumaDivisoresTCR05() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.sumaDivisores(1));
    }
}