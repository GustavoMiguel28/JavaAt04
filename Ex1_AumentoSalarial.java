import java.util.Scanner;

/*1. Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
a) esse funcionário foi contratado em 2005, com salário inicial de R$ 1.000,00;
b) em 2006 recebeu aumento de 1,5% sobre o salário inicial;
c) a partir de 2007 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
Faça um programa que determine o salário atual desse funcionário.*/

public class Ex1_AumentoSalarial {

    public static double valor_salario() {
        double aumento = 0.015;
        double salario = 1000 + (1000 * aumento);

        for (int i = 2007; i <= 2023; i++) {
            aumento = aumento * 2;
            salario = salario + (salario * aumento);

            System.out.println(aumento + "  -  " + (salario*aumento) + "  -  " + salario);
        }

        return salario;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario_atual = valor_salario();

        System.out.println("Seu salário atual (2023) é: R$" + String.format("%.2f", salario_atual));

        sc.close();

    }

}