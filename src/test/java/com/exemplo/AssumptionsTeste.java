package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test; // vem quando inicia um teste

public class AssumptionsTeste {
    // assumptions teste é assumir determinada condição para validar um teste
    
    @Test
    void validarAlgoSomenteNoUsuarioX() {
        Assumptions.assumeTrue( "X".equals(System.getenv("USER")));
        Assertions.assertEquals( 10,  5 + 5);
    }
}
