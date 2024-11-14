public class SistemaMetrico {
    public static void main(String[] args) {
        String sigla = "h";

        switch(sigla){
            case "P":{
                System.out.println("pequeno");
                break;
            }
            case "M":{
                System.out.println("medio");
                break;
            }
            case "G":{
                System.out.println("grande");
                break;
            }
            default:
            System.out.println("indefinido");
        }
    }
}
