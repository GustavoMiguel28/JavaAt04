import java.util.Scanner;

public class Ex17_CalculoInvestimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioCarlos = 2000.0;  // Salário de Carlos
        double salarioJoao = salarioCarlos / 3;  // Salário de João (um terço do salário de Carlos)

        double rendimentoCarlos = 0.02;  // Rendimento mensal da caderneta de poupança (2% ao mês)
        double rendimentoJoao = 0.05;    // Rendimento mensal do fundo de renda fixa (5% ao mês)

        int meses = 0;

        // Calcula até que o valor de João seja maior ou igual ao valor de Carlos
        while (salarioJoao < salarioCarlos) {
            salarioCarlos += salarioCarlos * rendimentoCarlos;  // Atualiza o valor de Carlos com o rendimento
            salarioJoao += salarioJoao * rendimentoJoao;        // Atualiza o valor de João com o rendimento
            meses++;
        }

        System.out.println("Quantidade de meses necessários: " + meses);

        scanner.close();
    }
}
