/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CalculadoraTestSumaSonAmigos {
    
    @Test
    public void testSonAmigosTCR01() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.sonAmigos(220, 284));
    }

    @Test
    public void testSonAmigosTCR02() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.sonAmigos(1184, 1210));
    }

    @Test
    public void testSonAmigosTCR03() {
        Calculadora calc = new Calculadora();
        assertFalse(calc.sonAmigos(30, 42));
    }

    @Test
    public void testSonAmigosTCR04() {
        Calculadora calc = new Calculadora();
        assertTrue(calc.sonAmigos(5020, 5564));
    }
}