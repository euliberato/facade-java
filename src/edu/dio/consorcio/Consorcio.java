package edu.dio.consorcio;

public class Consorcio {
    private Consorcio() {
        super();
    }

    public static void novoConsorcio(String nome, String cpf, String valor, String estado) {
        System.out.println("Consorcio Iniciado: ");
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(valor);
        System.out.println(estado);
    }
}
