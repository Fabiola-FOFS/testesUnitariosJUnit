package com.exemplo;

/**
 * Classe simples para operações matemáticas
 */
public class Calculadora {

    // Método de soma
    public int somar(int a, int b) {
        return a + b;
    }

    // Método de subtração
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método de multiplicação
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método de divisão com tratamento para divisão por zero
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return (double) a / b;
    }
}
