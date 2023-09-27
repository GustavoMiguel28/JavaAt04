import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6_SalarioFuncionarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<List<Double>> dados_gerais = new ArrayList<>();

        for (int i = 1; i <= 2; i ++) {

            List<Double> dados_funcionario = new ArrayList<>();

            System.out.println("\nDigite as informações do " + i + "° funcionário.");

            System.out.print("Código: ");
            double codigo = sc.nextDouble();       

            System.out.print("Horas trabalhadas: ");
            double horas_trabalhadas = sc.nextDouble();

            System.out.print("Turno de trabalho (M, V ou N): ");
            String turno = sc.next();

            System.out.print("Categoria (O ou G): ");
            String categoria = sc.next();

            double salario = 0;

            if ((categoria.equals("G")) && (turno.equals("N"))) {
                salario = horas_trabalhadas * (450 * 0.18);
            } else if ((categoria.equals("G")) && ((turno.equals("M")) || (turno.equals("V")))) {
                salario = horas_trabalhadas * (450 * 0.15);
            } else if ((categoria.equals("O")) && (turno.equals("N"))) {
                salario = horas_trabalhadas * (450 * 0.13);
            } else if ((categoria.equals("O")) && ((turno.equals("M")) || (turno.equals("V")))) {
                salario = horas_trabalhadas * (450 * 0.10);
            }

            double aux_alimentacao = 0;

            if (salario <= 300) {
                aux_alimentacao = salario * 0.20;
            } else if (salario <= 600) {
                aux_alimentacao = salario * 0.15;
            } else {
                aux_alimentacao = salario * 0.5;
            }

            dados_funcionario.add(codigo);
            dados_funcionario.add(salario);
            dados_funcionario.add(aux_alimentacao);

            dados_gerais.add(dados_funcionario);

        }

        for (List<Double> dados_funcionario : dados_gerais) {
            double codigo = dados_funcionario.get(0);
            double salario = dados_funcionario.get(1);
            double aux_alimentacao = dados_funcionario.get(2);

            System.out.println("Funcionário de código " + String.format("%.0f", codigo) + " terá um salário de R$" + String.format("%.2f", salario) + " e R$" + String.format("%.2f", aux_alimentacao) + " de vale alimentação");
        }

        sc.close();
    }
}
