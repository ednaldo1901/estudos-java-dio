package main.interfaces;

public interface AparelhoTelefonico {
    void adicionarContato(String contato); 
    void editarContato(String contatoAntigo, String contatoNovo);
    void fazerLigacao(String numero);
    void escolherMensagemVoz();
    void ligarVivaz();
}

