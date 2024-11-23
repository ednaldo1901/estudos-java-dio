package main.iphone;


import main.interfaces.ReprodutorMusical;
import main.interfaces.AparelhoTelefonico;
import main.interfaces.NavegadorInternet;

public class MeuIphone extends Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void escolherAlbum() {
        System.out.println("Álbum escolhido.");
    }

    @Override
    public void trocarMusica() {
        System.out.println("Música trocada.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música.");
    }

    @Override
    public void tocarAlbum() {
        System.out.println("Tocando álbum.");
    }

    @Override
    public void tocarVideo() {
        System.out.println("Tocando vídeo.");
    }

    
    @Override
    public void adicionarContato(String contato) {
        System.out.println("Contato " + contato + " adicionado.");
    }

    @Override
    public void editarContato(String contatoAntigo, String contatoNovo) {
        System.out.println("Contato " + contatoAntigo + " editado para " + contatoNovo + ".");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para " + numero + ".");
    }

    @Override
    public void escolherMensagemVoz() {
        System.out.println("Mensagem de voz escolhida.");
    }

    @Override
    public void ligarVivaz() {
        System.out.println("Ligação viva-voz ativada.");
    }

   
    @Override
    public void abrirNavegador() {
        System.out.println("Navegador aberto.");
    }

    @Override
    public void navegarPeloSite(String url) {
        System.out.println("Navegando no site: " + url);
    }
}
