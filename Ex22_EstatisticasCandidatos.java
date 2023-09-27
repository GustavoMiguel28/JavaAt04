import java.util.Scanner;

public class Ex22_EstatisticasCandidatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, countMulheres = 0, countHomens = 0, countHomensExperiencia = 0;
        int countMulheresMenor21ComExperiencia = 0, menorIdadeMulheresComExperiencia = Integer.MAX_VALUE;
        int totalHomens = 0, totalHomensMais45 = 0;
        int somaIdadeHomensExperiencia = 0;

        while (true) {
            System.out.print("Digite a idade do candidato (ou 0 para encerrar): ");
            idade = scanner.nextInt();

            if (idade == 0) {
                break;
            }

            System.out.print("Digite o sexo do candidato (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite a experiência do candidato (S para sim, N para não): ");
            char experiencia = scanner.next().charAt(0);

            if (sexo == 'M') {
                countHomens++;

                if (experiencia == 'S') {
                    countHomensExperiencia++;
                    somaIdadeHomensExperiencia += idade;

                    if (idade > 45) {
                        totalHomensMais45++;
                    }
                }
            } else if (sexo == 'F') {
                countMulheres++;

                if (experiencia == 'S' && idade < 21) {
                    countMulheresMenor21ComExperiencia++;

                    if (idade < menorIdadeMulheresComExperiencia) {
                        menorIdadeMulheresComExperiencia = idade;
                    }
                }
            }
        }

        double mediaIdadeHomensExperiencia = (countHomensExperiencia > 0) ?
                (double) somaIdadeHomensExperiencia / countHomensExperiencia : 0;
        double percentagemHomensMais45 = (countHomens > 0) ?
                ((double) totalHomensMais45 / countHomens) * 100 : 0;

        System.out.println("Número de candidatos do sexo feminino: " + countMulheres);
        System.out.println("Número de candidatos do sexo masculino: " + countHomens);
        System.out.println("Idade média dos homens com experiência: " + mediaIdadeHomensExperiencia);
        System.out.println("Percentagem dos homens com mais de 45 anos: " + percentagemHomensMais45 + "%");
        System.out.println("Número de mulheres com idade inferior a 21 anos e com experiência: " +
                countMulheresMenor21ComExperiencia);
        System.out.println("Menor idade entre as mulheres com experiência: " + menorIdadeMulheresComExperiencia);

        scanner.close();
    }
}
