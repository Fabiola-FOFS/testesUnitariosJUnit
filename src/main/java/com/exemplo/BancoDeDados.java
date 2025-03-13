package com.exemplo;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexão() {
        LOGGER.info("Iniciou Conexão");   
    }

    public static void finalizarConexão() {
        LOGGER.info("Finalizou Conexão");   
    }   

    public static void insereDados(Pessoa pessoa) {
        //insere pessoas no banco de dados 
        LOGGER.info("INSERIU DADOS");
    }

    public static void removeDados(Pessoa pessoa) {
        //remove pessoas no banco de dados 
        LOGGER.info("removeu DADOS");
}
}
