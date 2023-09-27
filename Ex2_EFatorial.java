import java.util.Scanner;

/*2. Faça um programa que leia um valor N inteiro e positivo, calcule e mostre o valor de E, conforme a fórmula a seguir:
E = 1 + 1/1! + 1⁄2! + 1/3! + ... + 1/N!*/

public class Ex2_EFatorial {
    
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de 'N': ");
        int n = sc.nextInt();

        double e = 1;

        for (int i = 1; i <= n; i++) {
            double fatorial = 1;

            for (int j = 2; j <= i; j++) {
                fatorial *= j;
            }

            e = e + (1/fatorial);
        }

        System.out.println(e);

        sc.close();
    }

}
