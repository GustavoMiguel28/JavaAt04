import java.util.Scanner;

/*3. Faça um programa que leia um número N e que indique quantos valores inteiros e positivos devem ser lidos a seguir.
Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor.*/

public class Ex3_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {

            int valor = 1;

            for (int i = 1; i <= x; i++) {
                valor *= i;
            }

            System.out.println(x + "! = " + valor);

        }
     
        sc.close();
    }
}