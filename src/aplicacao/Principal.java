package aplicacao;

import dados.Frase;

public class Principal {

    public static void main(String[] args) {

        Frase gerador = new Frase();

        System.out.println("Frase gerada:");
        System.out.println(gerador.montarFrase());

    }

}