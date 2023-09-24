package aparelho;

public class Main {

  public static void main(String[] args) {
    aparelhoMultiuso aparelho = new aparelhoMultiuso();

    System.out.println("------------->");
    aparelho.selecionarMusica("Shadow of Intent - The Migrant");
    aparelho.tocar();
    aparelho.pausar();

    System.out.println("------------->");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar(41845050);

    System.out.println("------------->");
    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();

    System.out.println("------------->");
  }

}