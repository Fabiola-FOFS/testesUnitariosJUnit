package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
/**
 * Testes unitários para a classe Calculadora
 */
public class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5, calc.somar(2, 3), "2 + 3 deve ser 5");
    }

    @Test
    public void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2), "3 - 2 deve ser 1");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3), "2 * 3 deve ser 6");
    }

    @Test
    public void testDividir() {
        assertEquals(2.0, calc.dividir(6, 3), "6 / 3 deve ser 2.0");
    }

    @Test
    public void testDivisaoPorZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.dividir(6, 0));
        assertEquals("Não é possível dividir por zero!", exception.getMessage());
    }
}
