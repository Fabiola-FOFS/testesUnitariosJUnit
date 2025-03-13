package com.exemplo;
import java.time.LocalDateTime; // IMPORTAÇÃO CORRETA

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PessoaTeste { 

        @Test 
        void deveCalcularIdadeCorreto() {
           Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 00));
           Assertions.assertEquals(22, jessica.getIdade());
        } //estrutura basica para o teste//
        
        @Test
        void deveRetornarseEMaiorDeIdade() {
            Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 00));
            Assertions.assertTrue(jessica.eMaiorDeIdade());

            Pessoa joao = new Pessoa("joão", LocalDateTime.of(2022,2, 7, 13, 01));
            Assertions.assertFalse(joao.eMaiorDeIdade());
        }


    }



