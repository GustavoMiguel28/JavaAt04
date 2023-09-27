import java.util.Scanner;

public class Ex13_MortalidadeInfantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de crianças nascidas no período: ");
        int totalCriancas = scanner.nextInt();

        int criancasFeminino = 0;
        int criancasMasculino = 0;
        int criancas24MesesOuMenos = 0;

        for (int i = 1; i <= totalCriancas; i++) {
            System.out.print("Digite o sexo da criança (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite o tempo de vida da criança em meses: ");
            int tempoVidaMeses = scanner.nextInt();

            if (sexo == 'M') {
                criancasMasculino++;
            } else if (sexo == 'F') {
                criancasFeminino++;
            }

            if (tempoVidaMeses <= 24) {
                criancas24MesesOuMenos++;
            }
        }

        double percentagemFeminino = (criancasFeminino / (double) totalCriancas) * 100;
        double percentagemMasculino = (criancasMasculino / (double) totalCriancas) * 100;
        double percentagem24MesesOuMenos = (criancas24MesesOuMenos / (double) totalCriancas) * 100;

        System.out.printf("Percentagem de crianças do sexo feminino mortas no período: %.2f%%\n", percentagemFeminino);
        System.out.printf("Percentagem de crianças do sexo masculino mortas no período: %.2f%%\n", percentagemMasculino);
        System.out.printf("Percentagem de crianças que viveram 24 meses ou menos no período: %.2f%%\n", percentagem24MesesOuMenos);

        scanner.close();
    }
}
