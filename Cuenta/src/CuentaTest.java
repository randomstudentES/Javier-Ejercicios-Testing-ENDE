import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    private Cuenta test;

    @BeforeEach
    void setUp() {
        test = new Cuenta("1234", 10000);
    }

    @org.junit.jupiter.api.Test
    void getNumero() {
        assertEquals("1234", test.getNumero(), "ERROR, EL NUMERO NO COINCIDE");
    }

    @org.junit.jupiter.api.Test
    void getSaldo() {
        assertEquals(10000, test.getNumero(), "ERROR, EL SALDO NO COINCIDE");
    }

    @org.junit.jupiter.api.Test
    void setNumero() {
        test.setNumero("4321");
        assertEquals("4321", test.getNumero(), "ERROR, NO SE HA CAMBIADO");
    }

    @org.junit.jupiter.api.Test
    void setSaldo() {
        test.setSaldo(1212);
        assertEquals(1212, test.getSaldo(), "ERROR, NO SE HA CAMBIADO");
    }

    @org.junit.jupiter.api.Test
    void ingresarDinero() {
        test.ingresarDinero(1);
        assertEquals(10001, test.getSaldo(), "ERROR, NO SE HA AÑADIDO");
    }

    @org.junit.jupiter.api.Test
    void extraerDinero() {
        test.extraerDinero(1);
        assertEquals(9999, test.getSaldo(), "ERROR, NO SE HA QUITADO");
    }

    @org.junit.jupiter.api.Test
    void mostrarCuenta() {
    }
}