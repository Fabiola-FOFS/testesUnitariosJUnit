package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//escolher a ordem dos testes
    
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //methodName - ordenaria por ordem afabética//
    public class EscolhendoOrdem {
    
        @Order(4)
        @Test
        void validaFluxoA() {
            Assertions.assertTrue(true);
        }

        @Order(3)
        @Test
        void validaFluxoB() {
            Assertions.assertTrue(true);
        }

        @Order(2)
        @Test
        void validaFluxoC() {
            Assertions.assertTrue(true);
        }

        @Order(1)
        @Test
        void validaFluxoD() {
            Assertions.assertTrue(true);
        }

    }