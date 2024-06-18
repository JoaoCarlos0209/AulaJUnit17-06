package aula1706.exercicio.CalculadoraTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import aula1706.exercicio.Calculadora.Calculadora;

public class CalculadoraTeste {
    
    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.soma(2, 3);
        assertEquals(5 , resultado);
        System.out.println("O resultado da soma é: " + resultado);
    }

    @Test
    public void testSubtracao() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtracao(4, 3);
        assertEquals(1 , resultado);
        System.out.println("O resultado da subtracao é: " + resultado);
    }

    @Test
    public void testMultiplicao() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicacao(2, 3);
        assertEquals(6 , resultado);
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    @Test
    public void testDivisao() throws IllegalAccessException {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.divisao(6, 3);
        assertEquals(2 , resultado);
        System.out.println("O resultado da divisão é: " + resultado);
    }
}
