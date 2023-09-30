package edu.dio;

import edu.dio.cliente.CadastroCliente;

public class Api {

    public static void main(String[] args) {
        CadastroCliente novoCliente = new CadastroCliente();
        novoCliente.cadastrarCliente("Ruan", "12341234123");
    }

}
