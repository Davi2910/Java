package contas;

public class Conta {
     //Atributos
     private String cliente;
     public String getCliente() {
      return cliente;
     }
     public void setCleinte(String cliente) {
      this.cliente = cliente;

     }
     // Encapsulamento
     private double saldo;
     public double getSaldo() {
      return saldo;
     }
     public void setSaldo(double saldo) {
      this.saldo = saldo;

     }

     //Construtor
     public Conta() {
        System.out.println("Agência 0261");
     }
     //Metodos
   protected void exibirSaldo() {
        System.out.println("Saldo: R$" + saldo);
     }

     void sacar(double valor) {
        saldo -= valor;
        System.out.println("Débito: R$" + valor);
     }

     void depositar(double valor) {
        saldo += valor;
        System.out.println("Crédito: R$" + valor);
     }

     void trasferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Trasferencia: R$" + valor);
     }
       //Metodo com retorno
     double soma(double cc1, double cc2) {
        double total = cc1 + cc2;
        return total;

     }

}