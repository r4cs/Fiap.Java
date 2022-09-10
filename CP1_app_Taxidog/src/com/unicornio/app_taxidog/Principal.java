package com.unicornio.app_taxidog;

import com.unicornio.app_taxidog.entidades.*;
import com.unicornio.app_taxidog.pagamento.*;

//18-Crie a classe Principal com um método main,
// nela crie um novo Pagamento, Motorista e Pagador,
// chame o método mostrar das classes.
public class Principal {
    public static void main(String[] args) {
        System.out.println("< início principal>");
        System.out.println("");
        System.out.println("<var animal em <principal.principal>");
        Animal animal = new Animal();
        animal.setNome("Caramelo");
        animal.mostrar();

        Endereco endCliente = new Endereco();
        endCliente.setRua("Rua dos bobos");
        endCliente.setNumero(666);
        endCliente.setBairro("Bairro dos bobos");
        endCliente.setCidade("Cidade dos besta");
        endCliente.setCep(78943541L);
        endCliente.setPais("Fora Bozo");

        Endereco endMot = new Endereco();
        endMot.setRua("Rua dos trabalhadores");
        endMot.setNumero(666);
        endMot.setBairro("Bairro da labuta");
        endMot.setCidade("Cidade dos besta");
        endMot.setCep(9194541L);
        endMot.setPais("Fora Bozo");

        Pagador pagador = new Pagador(animal);
        pagador.setNome("Pagador 1");
        pagador.setCpf(759215648L);
        pagador.setEndereco(endCliente);
        System.out.println("new Pagador.pedirNoApp(): ");
        pagador.pedirNoApp();
        System.out.println("new Pagador.mostrar(): ");
        pagador.mostrar();
        System.out.println("");


        Motorista motorista = new Motorista();
        motorista.setCnh(6549278L);
        motorista.setNome("Motorista 1");
        motorista.setCpf(789654123L);
        motorista.setEndereco(endMot); // printa local armzto em motorista.mostrar()
        System.out.println("\nMotorista.mostrar(): ");
        motorista.mostrar();

        System.out.println("\nMotorista.dirigirNoApp(): ");
        motorista.digirirNoApp();
        System.out.println("");
        System.out.println("");

        Pagamento pagamento = new Pagamento();
        pagamento.setPagador(pagador);
        pagamento.setMotorista(motorista);
        pagamento.setValor(19.99);
        pagamento.mostrar();
        System.out.println("< ---fim--- principal>");


    }
}