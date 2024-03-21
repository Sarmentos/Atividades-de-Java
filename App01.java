public class App01 {
    public static void main(String[] args) {
        double salario = 5000;
        String mensagem1 = "Eu vou doar 5000 para você";
        String mensagem2 = "Eu ainda não tenho condição, mas prometo que irei doar";
        String resultado;
        if (salario >= 5000){
            resultado = mensagem1;
        }else{
            resultado = mensagem2;
        }
        System.out.println(resultado);
    }
}

