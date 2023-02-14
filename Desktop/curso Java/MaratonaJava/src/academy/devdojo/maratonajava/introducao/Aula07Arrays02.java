package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
         //int [] idades = new int[3];
        //System.out.println(idades[0]);

        String [] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "fa";
        nomes[2] = "rAFA";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
