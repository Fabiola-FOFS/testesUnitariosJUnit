package com.exemplo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;



@ExtendWith(MockitoExtension.class) // Padrão para usar o Mockito
public class ListaTeste {

    @Mock // Mockando a lista
    private List<String> letras;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this); // Inicializa os mocks (caso necessário)
    }

    @Test
    void adicionarItemNaLista() {
        Mockito.when(letras.get(0)).thenReturn("B"); // Simula comportamento
        Assertions.assertEquals("B", letras.get(0)); // Teste da simulação
    
}
}
