package com.exemplo;
import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class consultarBancoDadosTeste {


    @BeforeAll
    static void configuraConexão() {
        BancoDeDados.iniciarConexão();
        System.out.println("Rodou configurarConexão");
    }

    @BeforeEach
    void insereDadosparaTeste() {
        BancoDeDados.insereDados(new Pessoa("jao", LocalDateTime.of(2000, 1, 13, 0, 0)));
    }

    @AfterEach
    void removedadosdoTeste() {
        BancoDeDados.removeDados(new Pessoa("jao", LocalDateTime.of(2000, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosdeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexão() {
        BancoDeDados.finalizarConexão();
        System.out.println("Rodou finalizarConexão");
    }
}
