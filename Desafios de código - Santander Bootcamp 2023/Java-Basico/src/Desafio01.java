import java.util.Scanner;

public class Desafio01 {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); 
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
    System.out.println("Informacoes:");
    System.out.println("Conta: " + conta.numero);
    System.out.println("Titular: " + conta.titular);
    System.out.println("Saldo: R$ " + conta.saldo);

     scanner.close();
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
   
  }
}
