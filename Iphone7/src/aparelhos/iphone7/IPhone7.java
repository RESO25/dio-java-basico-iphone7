package aparelhos.iphone7;

import aparelhos.aparelhotelefonico.AparelhoTelefonico;
import aparelhos.navegadorinternet.NavegadorInternet;
import aparelhos.reprodutormusical.ReprodutorMusical;

public class IPhone7 implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
    
    private String musicaAtual;
    
    // Telefone

    public void ligar(String telefone){
        System.out.println("Ligando para "+ telefone);
    }

    public void atender(){
        System.out.println("Alô?");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Me ligue quando puder!");
    }

    // Reprodutor Musical

    public void tocar(){
        System.out.println("Tocando: " + getMusicaAtual());
    }

    public void pausar(){
        System.out.println("Pausando a música...");
    }

    public void selecionarMusica(String musica){
        this.musicaAtual = musica;
        System.out.println("Música selecionada!");
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    // Navegador

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página...");                
    }

    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }
}
