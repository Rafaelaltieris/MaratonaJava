package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 1;

        //maneira 1
        /*switch (dia) {
            case 1 :
                System.out.println("Domingo-Fim de Semana");
                break;
            case 2 :
                System.out.println("Dia Útil");
                break;
            case 3 :
                System.out.println("Dia Útil");
                break;
            case 4 :
                System.out.println("Qua-Útil");
                break;
            case 5 :
                System.out.println("Qui-Útil");
                break;
            case 6 :
                System.out.println("Sex-Útil");
                break;
            case 7 :
                System.out.println("Sábado-Fim de Semana");
                break;
            default:
                System.out.println("opção Inválida");
                break;

        }*/
        //maneira 2
        switch (dia) {
            case 1:
            case 7:
            System.out.println("FDS");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
