package ambiente;

import aparelhos.iphone7.IPhone7;

public class Ambiente {
    public static void main(String[] args) {
        IPhone7 iphone = new IPhone7();

        iphone.selecionarMusica("We Up - 50 Cent ft. Kendrick Lamar");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("98841-2917");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
