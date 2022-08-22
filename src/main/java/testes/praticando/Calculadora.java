package testes.praticando;

public class Calculadora {
    // atributo
    private int resultado = 0;

    // método somar
    public double somar(int n1, int n2) {
        resultado = n1 + n2;
        return resultado;
    }

    // método subtrair
    public double subtrair(int n1, int n2) {
        resultado = n1 - n2;
        return resultado;
    }

    // método multiplicar
    public double multiplicar(int n1, int n2) {
        resultado = n1 * n2;
        return resultado;
    }

    // método dividir
    public double dividir(int n1, int n2) {
        resultado = n1 / n2;
        return resultado;
    }

}
