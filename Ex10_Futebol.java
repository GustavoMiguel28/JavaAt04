import java.util.Scanner;

/*Em um campeonato de futebol existem cinco times e cada time possui onze jogadores. Faça um programa que
receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:
 A quantidade de jogadores com idade inferior a 18 anos;
 A média das alturas de todos os jogadores de cada time;
 A média das alturas de todos os jogadores do campeonato;
 A percentagem de jogadores com mais de 80 quilos entre todos os jogadores do campeonato.*/

public class Ex10_Futebol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantMenorIdade = 0;
        double totalAlturaTime = 0;
        double totalAlturaGeral = 0;
        int quantPesados = 0;
        for (int i = 1; i <= 5; i++) {
            totalAlturaTime = 0;
            for (int j = 1; j <= 11; j++) {
                System.out.println("\nEntre com as informações do jogador " + j + " do time " + i);
                System.out.println("idade?");
                int idade = sc.nextInt();
                System.out.println("peso?");
                double peso = sc.nextDouble();
                System.out.println("altura?");
                double altura = sc.nextDouble();
                if (idade < 18) {
                    quantMenorIdade++;
                }
                if (peso > 80) {
                    quantPesados++;
                }
                totalAlturaTime += altura;
                totalAlturaGeral += altura;
            }
            System.out.println("média de altura do time: " + totalAlturaTime / 11);
        }
        System.out.println("menores: " + quantMenorIdade);
        System.out.println("média altura geral: " + totalAlturaGeral / 55);
        System.out.println("% > 80 Kg: " + quantPesados / 55d);

        sc.close();
    }
}
