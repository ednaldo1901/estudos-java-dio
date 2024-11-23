package main;

import main.iphone.MeuIphone;

public class Main {
    public static void main(String[] args) {
        MeuIphone meuIphone = new MeuIphone();

        
        meuIphone.ligarIphone();
        meuIphone.desbloquearIphone();
        
       
        meuIphone.escolherAlbum();
        meuIphone.tocarMusica();
        
 
        meuIphone.adicionarContato("João");
        meuIphone.fazerLigacao("123456789");

      
        meuIphone.abrirNavegador();
        meuIphone.navegarPeloSite("www.example.com");
    }
}
