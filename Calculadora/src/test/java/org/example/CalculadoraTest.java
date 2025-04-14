package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @org.junit.jupiter.api.Test
    void suma() {
        assertEquals(5, calculadora.suma(2, 3));
    }

    @org.junit.jupiter.api.Test
    void resta() {
        assertEquals(1, calculadora.resta(4, 3));
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
        assertEquals(12, calculadora.multiplicacion(4, 3));
    }

    @org.junit.jupiter.api.Test
    void division() {
        assertEquals(2, calculadora.division(6, 3));
    }

    @org.junit.jupiter.api.Test
    void esPar() {
        assertTrue(calculadora.esPar(4));
        assertFalse(calculadora.esPar(3));
    }

    @org.junit.jupiter.api.Test
    void maximo() {
        assertEquals(7, calculadora.maximo(5, 7, 2));
    }
}