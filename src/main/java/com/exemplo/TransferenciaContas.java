package com.exemplo;

public class TransferenciaContas {

    public void transfere(Conta contaOrigem, Conta contaDestino, int valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }
    }
    
}
