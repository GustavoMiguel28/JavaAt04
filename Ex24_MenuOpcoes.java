import java.util.Scanner;

public class Ex24_MenuOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calcularImposto();
                    break;
                case 2:
                    calcularNovoSalario();
                    break;
                case 3:
                    classificarSalario();
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }

    private static void calcularImposto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double imposto;
        if (salario < 500) {
            imposto = salario * 0.05;
        } else if (salario <= 850) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.15;
        }

        System.out.println("O valor do imposto é: R$ " + imposto);

        scanner.close();
    }

    private static void calcularNovoSalario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double novoSalario;
        if (salario > 1500) {
            novoSalario = salario + 25;
        } else if (salario >= 750) {
            novoSalario = salario + 50;
        } else if (salario >= 450) {
            novoSalario = salario + 75;
        } else {
            novoSalario = salario + 100;
        }

        System.out.println("O novo salário é: R$ " + novoSalario);

        scanner.close();
    }

    private static void classificarSalario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        if (salario <= 750) {
            System.out.println("Classificação: Mal remunerado");
        } else {
            System.out.println("Classificação: Bem remunerado");
        }

        scanner.close();
    }
}
