import java.util.Scanner;

public class Ex12_FolhaPagamentoFabrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalOperarios = 15;
        double salarioMinimo = 450.00;
        double totalFolhaPagamento = 0;
        int totalPecasFabricadas = 0;
        int totalPecasHomens = 0;
        int totalPecasMulheres = 0;
        double maiorSalario = 0;
        int numeroOperarioMaiorSalario = 0;

        for (int i = 1; i <= totalOperarios; i++) {
            System.out.print("Digite o número do operário: ");
            int numeroOperario = scanner.nextInt();

            System.out.print("Digite o número de peças fabricadas no mês: ");
            int pecasFabricadas = scanner.nextInt();

            System.out.print("Digite o sexo do operário (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            double salario;
            if (pecasFabricadas <= 30) {
                salario = salarioMinimo;
            } else if (pecasFabricadas <= 31) {
                salario = salarioMinimo + (0.03 * salarioMinimo);
            } else {
                salario = salarioMinimo + (0.05 * salarioMinimo);
            }

            totalFolhaPagamento += salario;
            totalPecasFabricadas += pecasFabricadas;

            if (sexo == 'M') {
                totalPecasHomens += pecasFabricadas;
            } else if (sexo == 'F') {
                totalPecasMulheres += pecasFabricadas;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
                numeroOperarioMaiorSalario = numeroOperario;
            }

            System.out.printf("Operário %d: Salário = R$ %.2f%n", numeroOperario, salario);
        }

        double mediaPecasHomens = totalPecasHomens / (double) (totalOperarios / 2);
        double mediaPecasMulheres = totalPecasMulheres / (double) (totalOperarios / 2);

        System.out.println("\nEstatísticas:");
        System.out.printf("Total da folha de pagamento da fábrica: R$ %.2f%n", totalFolhaPagamento);
        System.out.printf("Número total de peças fabricadas no mês: %d%n", totalPecasFabricadas);
        System.out.printf("Média de peças fabricadas pelos homens: %.2f%n", mediaPecasHomens);
        System.out.printf("Média de peças fabricadas pelas mulheres: %.2f%n", mediaPecasMulheres);
        System.out.printf("Operário de maior salário: Operário %d, Salário = R$ %.2f%n", numeroOperarioMaiorSalario, maiorSalario);

        scanner.close();
    }
}
