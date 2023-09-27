import java.util.Scanner;

public class Ex19_SomaNumerosEntreMEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        while (true) {
            System.out.print("Digite o valor de m: ");
            int m = scanner.nextInt();

            System.out.print("Digite o valor de n: ");
            int n = scanner.nextInt();

            if (m >= n) {
                break;
            }

            // Calcula a soma dos números entre m e n (inclusive)
            for (int i = m; i <= n; i++) {
                soma += i;
            }
        }

        System.out.println("A soma dos números inteiros entre m e n é: " + soma);

        scanner.close();
    }
}
