public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv SmartTv = new SmartTv();
        System.out.println("TV esta ligada ? " + SmartTv.ligada);
        System.out.println("Canal atual: " + SmartTv.canal);
        System.out.println("Volume Atual: " + SmartTv.volume);

        SmartTv.ligar();
        System.out.println("TV esta ligada ? " + SmartTv.ligada);

        SmartTv.desligar();
        System.out.println("TV esta ligada ? " + SmartTv.ligada);
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        SmartTv.aumentarVolume();
        System.out.println("Volume Atual: " + SmartTv.volume);
        SmartTv.baixarVolume();
        System.out.println("Volume Atual: " + SmartTv.volume);

        SmartTv.mudarCanal(20);
        System.out.println("Canal atual: " + SmartTv.canal);

        SmartTv.diminuirCanal();
        System.out.println("Canal atual: " + SmartTv.canal);

        


    }
}
