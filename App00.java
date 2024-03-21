public class App00 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAltorizadoComprarbebida = idade >= 18;
        // !
        if(isAltorizadoComprarbebida != false){
            System.out.println("Altorizado a comprar bebida alcólica");
        }
        else{
            System.out.println("Não está altorizado a comprar bebida alcólica");
        }
        if (!isAltorizadoComprarbebida) {
            System.out.println("Não está altorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo nunca deve ser falso");
            
        }
    }
}
