import java.util.Scanner;

public class Ex18_TabelaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Imprime o cabeçalho da tabela
        System.out.println("Valor\tQuadrado\tCubo\tRaiz Quadrada");

        // Loop para ler os valores e imprimir a tabela
        while (true) {
            System.out.print("Digite um valor (ou valor negativo/zero para sair): ");
            double valor = scanner.nextDouble();

            // Verifica se o valor é negativo ou zero para sair do loop
            if (valor <= 0) {
                break;
            }

            // Calcula os valores
            double quadrado = valor * valor;
            double cubo = valor * valor * valor;
            double raizQuadrada = Math.sqrt(valor);

            // Imprime os valores na tabela
            System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f%n", valor, quadrado, cubo, raizQuadrada);
        }

        scanner.close();
    }
}
