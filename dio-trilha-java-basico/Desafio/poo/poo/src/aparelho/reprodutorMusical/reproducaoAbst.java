package aparelho.reprodutorMusical;

public abstract class reproducaoAbst implements reproducaoIntfc {

  protected String nome;

  public reproducaoAbst(String nome) {
    this.nome = nome;
  }

  @Override
  public void tocar() {
    System.out.println(nome + " está tocando");
  }

  @Override
  public void pausar() {
    System.out.println(nome + " pausada!");
  }

  @Override
  public void selecionarMusica(String nome) {
    this.nome = nome;
    System.out.println(nome + " selecionada");
  }

  public String getNome() {
    return nome;
  }
}