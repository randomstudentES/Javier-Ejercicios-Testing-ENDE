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
    void suma() {
        assertEquals(3, calculadora.suma(2, 1));
    }

    @org.junit.jupiter.api.Test
    void resta() {
        assertEquals(1, calculadora.resta(2, 1));
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
        assertEquals(6, calculadora.multiplicacion(3, 2));
    }

    @org.junit.jupiter.api.Test
    void division() {
        assertEquals(2, calculadora.division(4, 2));
    }

    @org.junit.jupiter.api.Test
    void esPar() {
    }

    @org.junit.jupiter.api.Test
    void maximo() {
    }

    @org.junit.jupiter.api.Test
    void esDivisible() {
    }
}