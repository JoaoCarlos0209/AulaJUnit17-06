package aula1706.exercicio.Calculadora;

public class Calculadora {
    
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) throws IllegalAccessException {
        if (b == 0) {
            throw new IllegalAccessException("Variável b não pode receber 0");
        }
        return a / b;
    }
}
