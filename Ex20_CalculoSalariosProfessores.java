import java.util.Scanner;

public class Ex20_CalculoSalariosProfessores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo, horasAula;
        char sexo;
        double salarioHoraAula = 30.0;
        double salarioBruto, salarioLiquido;
        double totalSalarioLiquidoHomens = 0, totalSalarioLiquidoMulheres = 0;
        int countHomens = 0, countMulheres = 0;

        while (true) {
            System.out.print("Digite o código do professor (ou 99999 para encerrar): ");
            codigo = scanner.nextInt();

            if (codigo == 99999) {
                break;
            }

            System.out.print("Digite o sexo do professor (M para masculino, F para feminino): ");
            sexo = scanner.next().charAt(0);

            System.out.print("Digite o número de horas/aula mensal: ");
            horasAula = scanner.nextInt();

            salarioBruto = horasAula * salarioHoraAula;

            // Calcula o desconto e o salário líquido
            if (sexo == 'M') {
                salarioLiquido = salarioBruto * 0.90; // Desconto de 10% para homens
                totalSalarioLiquidoHomens += salarioLiquido;
                countHomens++;
            } else if (sexo == 'F') {
                salarioLiquido = salarioBruto * 0.95; // Desconto de 5% para mulheres
                totalSalarioLiquidoMulheres += salarioLiquido;
                countMulheres++;
            } else {
                System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
                continue;
            }

            // Imprime as informações do professor
            System.out.println("Código: " + codigo);
            System.out.println("Salário bruto: R$ " + salarioBruto);
            System.out.println("Salário líquido: R$ " + salarioLiquido);
            System.out.println();
        }

        // Calcula a média dos salários líquidos para cada sexo
        double mediaSalarioLiquidoHomens = totalSalarioLiquidoHomens / countHomens;
        double mediaSalarioLiquidoMulheres = totalSalarioLiquidoMulheres / countMulheres;

        // Imprime a média dos salários líquidos para cada sexo
        System.out.println("Média dos salários líquidos dos professores do sexo masculino: R$ " + mediaSalarioLiquidoHomens);
        System.out.println("Média dos salários líquidos dos professores do sexo feminino: R$ " + mediaSalarioLiquidoMulheres);

        scanner.close();
    }
}
