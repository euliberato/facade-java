package edu.dio.cliente;

import edu.dio.concessionaria.DadosCompra;
import edu.dio.consorcio.Consorcio;

public class CadastroCliente {
    public void cadastrarCliente(String nome, String cpf) {

        String valor = DadosCompra.getInstancia().recuperarValor(cpf);
        String estado = DadosCompra.getInstancia().recuperarEstado(cpf);

        Consorcio.novoConsorcio(nome, cpf, valor, estado);
    }
}
