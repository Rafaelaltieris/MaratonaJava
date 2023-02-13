package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;

        System.out.println(numero02-numero01);

        // Maior e menos < >
        boolean isDezMariorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 10.0;

        System.out.println("isDezMariorQueVinte "+ isDezMariorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+ isDezIgualVinte);
        System.out.println("isDezIgualDez "+ isDezIgualDez);
        System.out.println("isDezDiferenteVinte "+ isDezDiferenteVinte);

        // && (AND) || (OR)
        int idade = 35;
        float salario = 3500F;
        boolean IsDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean IsDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("IsDentroDaLeiMaiorQueTrinta "+ IsDentroDaLeiMaiorQueTrinta);
        System.out.println("IsDentroDaLeiMenorQueTrinta "+ IsDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);



        // = += -= *= /= %=

        double bonus = 1800; //1800
        bonus += 1000;  //2800
        bonus -=1000; //800
        bonus *= 2;
        bonus %= 2;
        bonus /= 2;
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1; //contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);

;    }
}
