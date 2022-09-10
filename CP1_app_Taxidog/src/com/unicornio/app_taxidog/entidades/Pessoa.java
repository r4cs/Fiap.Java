package com.unicornio.app_taxidog.entidades;
import com.unicornio.app_taxidog.util.Mostravel;
//4-Crie os atributos da classe Pessoa:
// nome (tipo String) | cpf (tipo Long) | endereco (tipo Endereco)
//17-Nas classes *** Pagamento, Pessoa e Animal *** escreva do lado do
//    nome da classe "implements Mostravel", perceba que ao fazer
//    isso obritoriamente temos que escrever um método mostrar
//    em cada uma das classes
public class Pessoa implements Mostravel {
    String nome;
    Long cpf;
    Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public void mostrar() {
        System.out.print("");
        System.out.println("      <início entidade.pessoa.mostrar()> : ");
        System.out.println("         nome: " + nome);
        System.out.println("         cpf: " + cpf);
        endereco.mostraEndereco();
        System.out.println("      <---fim--- entidade.pessoa.mostrar()> : ");
        System.out.print("");
        }
}
