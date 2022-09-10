package com.unicornio.app_taxidog.entidades;
//import com.unicornio.app_taxidog.entidades.Animal.*;

//7-Crie os atributos da classe Pagador: animal (tipo Animal)
//16-Nas classes Pagador e Motorista escreva do lado do nome da
//        classe "extends Pessoa" para que elas se tornem filhas de pessoa
public class Pagador extends Pessoa {
    Animal animal;

    public Pagador(Animal nomeAnimal) {
        this.animal = nomeAnimal;
    }

//8-Na classe Pagador crie o método: public void pedirNoApp()
    public void pedirNoApp() {
        System.out.print("");
        System.out.println("      <início entidades.pagador.pedirNoapp()> ");
        System.out.println("          Proprietário do animal  " + animal.nome + " pediu no APP.");
        System.out.println("      < ---fim--- entidades.pagador.pedirNoapp()> " + animal.nome);
        System.out.print("");
    }
}