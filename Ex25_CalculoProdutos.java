import java.util.Scanner;

public class Ex25_CalculoProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoUnitario, imposto, valorTransporte, seguro, precoFinal, totalImpostos = 0;
        int paisOrigem, cargaPerigosa;
        String meioTransporte;

        while (true) {
            System.out.print("Digite o preço unitário do produto (ou preço inválido para encerrar): R$ ");
            precoUnitario = scanner.nextDouble();

            if (precoUnitario <= 0) {
                break;
            }

            System.out.print("Digite o país de origem (1 – Estados Unidos, 2 – México, 3 – Outros): ");
            paisOrigem = scanner.nextInt();

            System.out.print("Digite o meio de transporte (T – terrestre, F – fluvial, A – aéreo): ");
            meioTransporte = scanner.next();

            System.out.print("A carga é perigosa? (S – Sim, N – Não): ");
            char cargaPerigosaChar = scanner.next().charAt(0);
            cargaPerigosa = (cargaPerigosaChar == 'S') ? 1 : 0;

            // Calcular imposto
            if (precoUnitario <= 100) {
                imposto = precoUnitario * 0.05;
            } else {
                imposto = precoUnitario * 0.10;
            }

            // Calcular valor do transporte
            if (cargaPerigosa == 1) {
                if (paisOrigem == 1) {
                    valorTransporte = 50.00;
                } else if (paisOrigem == 2) {
                    valorTransporte = 21.00;
                } else {
                    valorTransporte = 24.00;
                }
            } else {
                if (paisOrigem == 1) {
                    valorTransporte = 12.00;
                } else if (paisOrigem == 2) {
                    valorTransporte = 21.00;
                } else {
                    valorTransporte = 60.00;
                }
            }

            // Calcular seguro
            if (paisOrigem == 2 || meioTransporte.equals("A")) {
                seguro = precoUnitario / 2;
            } else {
                seguro = 0;
            }

            // Calcular preço final
            precoFinal = precoUnitario + imposto + valorTransporte + seguro;
            totalImpostos += imposto;

            System.out.println("Imposto: R$ " + imposto);
            System.out.println("Valor do transporte: R$ " + valorTransporte);
            System.out.println("Valor do seguro: R$ " + seguro);
            System.out.println("Preço final: R$ " + precoFinal);
        }

        System.out.println("Total dos impostos: R$ " + totalImpostos);

        scanner.close();
    }
}
