package testes.praticando;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc;

    @BeforeEach
    void inicializacao() {
        calc = new Calculadora();
    }


    @Test
    void testSomar_numerosPositivos(){
        int n1 = 1;
        int n2 = 3;
        double resultado = calc.somar(n1,n2);
        double esperado = 4d;

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void testSomar_numerosNegativos(){
        int n1 = -6;
        int n2 = -3;
        double resultado = calc.somar(n1,n2);
        double esperado = -9d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testSomar_numerosNegativoEPositivo(){
        int n1 = -15;
        int n2 = 6;
        double resultado = calc.somar(n1,n2);
        double esperado = -9d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testSomar_numerosPositivoENegativo(){
        int n1 = 6;
        int n2 = -5;
        double resultado = calc.somar(n1,n2);
        double esperado = 1d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testSubtrair_numerosPositivos(){
        int n1 = 25;
        int n2 = 47;
        double resultado = calc.subtrair(n1,n2);
        double esperado = -22d;

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void testSubtrair_numerosNegativos(){
        int n1 = -69;
        int n2 = -19;
        double resultado = calc.subtrair(n1,n2);
        double esperado = -50d;

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void testSubtrair_numerosNegativoEPositivo(){
        int n1 = -105;
        int n2 = 43;
        double resultado = calc.subtrair(n1,n2);
        double esperado = -148d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testSubtrair_numerosPositivoENegativo(){
        int n1 = 5098;
        int n2 = -1500;
        double resultado = calc.subtrair(n1,n2);
        double esperado = 6598d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testMultiplicar_numerosPositivos(){
        int n1 = 25;
        int n2 = 6;
        double resultado = calc.multiplicar(n1,n2);
        double esperado = 150d;

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void testMultiplicar_numerosNegativos(){
        int n1 = -30;
        int n2 = -9;
        double resultado = calc.multiplicar(n1,n2);
        double esperado = 270d;

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void testMultiplicar_numerosPositivoENegativo(){
        int n1 = 100;
        int n2 = -11;
        double resultado = calc.multiplicar(n1,n2);
        double esperado = -1100d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testMultiplicar_numerosPorZero(){
        int n1 = 99;
        int n2 = 0;
        double resultado = calc.multiplicar(n1,n2);
        double esperado = 0d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testDividir_numeradorZero(){
        int n1 = 0;
        int n2 = 150;
        double resultado = calc.dividir(n1,n2);
        double esperado = 0d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testDividir_numerosPositivos(){
        int n1 = 50;
        int n2 = 7;
        double resultado = calc.dividir(n1,n2);
        double esperado = 7.0d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testDividir_numerosNegativos(){
        int n1 = -15;
        int n2 = -3;
        double resultado = calc.dividir(n1,n2);
        double esperado = 5.0d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testDividir_numerosPositivoENegativo(){
        int n1 = 20;
        int n2 = -15;
        double resultado = calc.dividir(n1,n2);
        double esperado = -1.0d;

        assertEquals(esperado, resultado);
    }

    @Test
    void testDividir_numerosNegativoEPositivo(){
        int n1 = 20;
        int n2 = -15;
        double resultado = calc.dividir(n1,n2);
        double esperado = -1.0d;

        assertEquals(esperado, resultado);
    }
}