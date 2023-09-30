package edu.dio.concessionaria;

public class DadosCompra {
    private static DadosCompra novaCompra = new DadosCompra();

    private DadosCompra() {
        super();
    }

    public static DadosCompra getInstancia() {
        return novaCompra;
    }

    public String recuperarValor(String cpf) {
        return "62500.60";
    }

    public String recuperarEstado(String cpf) {
        return "Novo";
    }
}
