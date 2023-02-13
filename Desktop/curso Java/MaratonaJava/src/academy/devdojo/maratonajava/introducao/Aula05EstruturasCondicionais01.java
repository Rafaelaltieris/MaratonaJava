package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprar = idade >= 18;
        if(isAutorizadoComprar) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        // !!
        if(!isAutorizadoComprar) {
            System.out.println(" Não Autorizado a comprar bebida alcólica");
        }
    }
}
