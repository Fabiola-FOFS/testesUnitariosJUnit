package com.exemplo;
import org.junit.jupiter.api.Assertions;

import com.exemplo.TransferenciaContas;

import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    //testar cenários de exceções//
    @Test
    void validaCenariodeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456123", 100);
    
        // asserção para encontrar excecao
        TransferenciaContas transferenciaContas = new TransferenciaContas();
        Assertions.assertThrows(IllegalArgumentException.class, () -> 
            transferenciaContas.transfere(contaOrigem, contaDestino, -1));
    }
    
    
}
