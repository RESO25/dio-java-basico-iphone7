package aparelhos.reprodutormusical;

public interface ReprodutorMusical {
    String musicaAtual = "";

    public void tocar();
    public void pausar();
    public void selecionarMusica(String musica);
}
