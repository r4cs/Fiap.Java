package com.unicornio.app_taxidog.entidades;

//9-Na classe Endereco crie os atributos:
//        rua (tipo String)    | numero (tipo Integer)
//        bairro (tipo String) | cep (tipo Long)
//        cidade (tipo String) | estado (tipo String)
//        pais (tipo String)
public class Endereco {
    String rua;
    Integer numero;
    String bairro;
    Long cep;
    String cidade;
    String estado;
    String pais;

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public Long getCep() {
        return cep;
    }
    public void setCep(Long cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    //10-Na classe Endereco crie o método:  public void mostraEndereco()
    public void mostraEndereco() {
        System.out.print("");
        System.out.println("      <início entidades.endereco.mostraEndereco()> ");
        System.out.print("             " + rua + ", ");
        System.out.print(numero.toString());
        System.out.print(", " + bairro +", ");
        System.out.print(cep.toString());
        System.out.print(", " + cidade + ", ");
        System.out.print(estado + ", ");
        System.out.println(pais + ".");
        System.out.println("      < ---fim--- entidades.endereco.mostraEndereco()> ");
        System.out.println("");

    }
}
