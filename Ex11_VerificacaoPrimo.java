import java.util.Scanner;

public class Ex11_VerificacaoPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  // Não é primo, pois é divisível por um número diferente de 1 e ele mesmo
            }
        }

        return true;  // É primo, pois não foi divisível por nenhum número diferente de 1 e ele mesmo
    }
}
