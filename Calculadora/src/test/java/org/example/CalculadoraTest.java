package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @org.junit.jupiter.api.Test
    void suma() { //complejidad 1
        assertEquals(3, calculadora.suma(2, 1));
    }

    @org.junit.jupiter.api.Test
    void resta() { //complejidad 1
        assertEquals(1, calculadora.resta(2, 1));
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() { //complejidad 1
        assertEquals(6, calculadora.multiplicacion(3, 2));
    }

    @org.junit.jupiter.api.Test
    void division() { //complejidad 2
        assertEquals(2, calculadora.division(4, 2));
    }

    @org.junit.jupiter.api.Test
    void esPar() { //complejidad 2
        assertTrue(calculadora.esPar(4));

    }

    @org.junit.jupiter.api.Test
    void maximo() { //complejidad 3
        assertEquals(5, calculadora.maximo(1, 5, 4));
    }

    @org.junit.jupiter.api.Test
    void esDivisible() { //complejidad 3
        assertTrue(calculadora.esDivisible(6, 2));
    }
}