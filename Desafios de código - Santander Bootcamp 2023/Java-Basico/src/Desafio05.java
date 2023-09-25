import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        if (valor > 0) {
          double saldo = valor;
        
            System.out.println("Deposito realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        } else if (valor == 0.0) {
           
            System.out.println("Encerrando o programa...");
        } else {
           
             System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
        scanner.close();
    }
}