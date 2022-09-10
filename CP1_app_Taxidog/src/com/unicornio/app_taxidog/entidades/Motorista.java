package com.unicornio.app_taxidog.entidades;
//5-Crie os atributos da classe Motorista: cnh (tipo Long)
//16-Nas classes Pagador e Motorista escreva do lado do nome da
//        classe "extends Pessoa" para que elas se tornem filhas
//        de pessoa
public class Motorista extends Pessoa {
    Long cnh;

    public Long getCnh() {
        return cnh;
    }
    public void setCnh(Long cnh) {
        this.cnh = cnh;
    }

    //6-Na classe Motorista crie o método: public void dirigirNoApp()
    public void digirirNoApp() {
        System.out.print("");
        System.out.println("      < início entidade.motorista.dirigirNoApp()> : ");
        System.out.println("           Motorista proprietário do cnh " + cnh.toString() + " aceitou a corrida");
        System.out.println("      < ---fim--- entidade.motorista.dirigirNoApp()> : ");
        System.out.print("");
    }
}