package org.example;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp(){
        calculadora = new Calculadora();
    }

    @org.junit.jupiter.api.Test
    void suma() {
        assertEquals(3, calculadora.suma(1, 2));
    }

    @org.junit.jupiter.api.Test
    void resta() {
        assertEquals(1, calculadora.resta(3, 2));
    }

    @org.junit.jupiter.api.Test
    void multiplicacion() {
    }

    @org.junit.jupiter.api.Test
    void division() {
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