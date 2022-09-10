package com.unicornio.app_taxidog.entidades;
import com.unicornio.app_taxidog.util.Mostravel;
//11-Crie o atributo da classe Animal:  nome (tipo String)
//17-Nas classes *** Pagamento, Pessoa e Animal *** escreva do lado do
//    nome da classe "implements Mostravel", perceba que ao fazer
//    isso obritoriamente temos que escrever um método mostrar
//    em cada uma das classes
public class Animal implements Mostravel {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrar() {
        System.out.print("");
        System.out.println("      <incício entidades.Animal.mostrar()> ");
        System.out.println("              O nome do animal é " + nome);
        System.out.println("      < ---fim--- entidades.Animal.mostrar()> ");
        System.out.print("");

    }
}
