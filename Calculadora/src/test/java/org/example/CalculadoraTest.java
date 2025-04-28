package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void nuevaCalculadora(){
        calculadora = new Calculadora();
    }

    @Test
    void suma() { // Complejidad: 1
        int resultado = calculadora.suma(1, 2);
        assertEquals(3, resultado, "NO SE HA SUMADO CORRECTAMENTE");
    }

    @Test
    void resta() { // Complejidad: 1
        int resultado = calculadora.resta(2, 1);
        assertEquals(1, resultado, "NO SE HA RESTADO CORRECTAMENTE");
    }

    @Test
    void multiplicacion() { // Complejidad: 1
        int resultado = calculadora.resta(2, 3);
        assertEquals(6, resultado, "NO SE HA MULTIPLICADO CORRECTAMENTE");
    }

    @Test
    void division() { // Complejidad: 2

    }

    @Test
    void esPar() { // Complejidad: 1
    }

    @Test
    void maximo() { // Complejidad: 5
    }

    @Test
    void esDivisible() { // Complejidad: 3
    }
}