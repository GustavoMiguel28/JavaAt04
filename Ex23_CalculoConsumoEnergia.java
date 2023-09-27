import java.util.Scanner;

public class Ex23_CalculoConsumoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo, valorQuilowatt, valorPagar, faturamentoGeral = 0;
        int tipoConsumidor, quilowatts;
        int countConsumidores500a1000 = 0;

        System.out.print("Digite o valor do salário mínimo: R$ ");
        salarioMinimo = scanner.nextDouble();

        valorQuilowatt = salarioMinimo / 8.0;

        while (true) {
            System.out.print("Digite a quantidade de quilowatts consumidos (ou 0 para encerrar): ");
            quilowatts = scanner.nextInt();

            if (quilowatts == 0) {
                break;
            }

            System.out.print("Digite o tipo de consumidor (1 – residencial, 2 – comercial ou 3 – industrial): ");
            tipoConsumidor = scanner.nextInt();

            double valorGasto = valorQuilowatt * quilowatts;

            // Aplica o acréscimo baseado no tipo de consumidor
            double acrescimo = 0;
            if (tipoConsumidor == 1) {
                acrescimo = 0.05 * valorGasto;
            } else if (tipoConsumidor == 2) {
                acrescimo = 0.10 * valorGasto;
            } else if (tipoConsumidor == 3) {
                acrescimo = 0.15 * valorGasto;
            }

            valorPagar = valorGasto + acrescimo;
            faturamentoGeral += valorPagar;

            // Verifica se o valor a ser pago está entre R$ 500,00 e R$ 1.000,00
            if (valorPagar >= 500.00 && valorPagar <= 1000.00) {
                countConsumidores500a1000++;
            }
        }

        System.out.println("Valor de cada quilowatt: R$ " + valorQuilowatt);
        System.out.println("Faturamento geral da empresa: R$ " + faturamentoGeral);
        System.out.println("Quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00: " + countConsumidores500a1000);

        scanner.close();
    }
}
