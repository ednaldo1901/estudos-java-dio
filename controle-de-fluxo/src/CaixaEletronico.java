public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 250.45;
        double valorSacado = 260.45;

        if(valorSacado <= saldo)
            saldo = saldo - valorSacado;
        else
            System.out.println("Saldo Insuficiente seu saldo e: " + saldo + " e voce quer sacar " + valorSacado);

        System.out.println("valor do seu: " + saldo);
    }
}
