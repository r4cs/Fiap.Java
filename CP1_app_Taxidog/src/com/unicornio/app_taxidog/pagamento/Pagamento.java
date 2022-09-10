package com.unicornio.app_taxidog.pagamento;

import com.unicornio.app_taxidog.entidades.Motorista;
import com.unicornio.app_taxidog.entidades.Pagador;
import com.unicornio.app_taxidog.util.Mostravel;

//12-No Pacote com.unicornio.app_taxidog.pagamento crie a classe Pagamento com os atributos:
//        pagador (tipo Pagador) | valor (tipo Double) | motorista (tipo Motorista)
//17-Nas classes ***  Pagamento, Pessoa e Animal ***  escreva do lado do
//        nome da classe "implements Mostravel", perceba que ao fazer
//        isso obrigatoriamente temos que escrever um método mostrar
//        em cada uma das classes (o Eclipse vai mostrar um erro na
//        classe e a opção de escrever o método automaticamente, use essa opção)
public class Pagamento  implements Mostravel {
    Pagador pagador;
    Double valor;
    Motorista motorista;

    public Pagador getPagador() {
        return pagador;
    }
    public void setPagador(Pagador pagador) {
        this.pagador = pagador;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

//13-Na classe Pagamento crie o método public void pagar()
    public void pagar() {
        System.out.println("Valor " + valor.toString() + " pago.");
    }

    @Override
    public void mostrar() {
        System.out.println("    <início pagamento.Pagamento.mostrar()> ");
        System.out.println("         Pago!! \n        Cliente: " + pagador.getNome() +
                "solicitou corrida com o motorista " + motorista.getNome()
                + "e pagou o valor de R$ " + valor);
        System.out.println("     < ---- fim ---- pagamento.Pagamento.mostrar()> ");
    }
}