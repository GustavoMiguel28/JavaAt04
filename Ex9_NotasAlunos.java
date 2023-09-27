import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*9. Faça um programa que receba duas notas de 6 alunos, calcule e mostre:
- a média aritmética das duas notas de cada aluno;
- a mensagem que está na tabela a seguir:
Média aritmética Mensagem
Até 3,0 Reprovado
Entre 3,0 e 7,0 Exame
Acima de 7,0 Aprovado
- o total de alunos aprovados;
- o total de alunos de exame;
- o total de alunos reprovados;
- a média da classe.*/

public class Ex9_NotasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Recendo notas dos alunos
        List<List<Double>> notas_gerais = new ArrayList<>();

        for (int i = 1; i <= 6; i ++) {
            List<Double> notas_aluno = new ArrayList<>();

            System.out.println("\nNotas do " + i + "° Aluno(a).");

            System.out.print("1° Nota: ");
            double nota_1 = sc.nextDouble();
            notas_aluno.add(nota_1);

            System.out.print("2° Nota: ");
            double nota_2 = sc.nextDouble();
            notas_aluno.add(nota_2);

            notas_gerais.add(notas_aluno);

        }

        //Calculando média dos alunos
        int i = 1;

        List<Double> lista_aprovados = new ArrayList<>();
        List<Double> lista_exames = new ArrayList<>();
        List<Double> lista_reprovados = new ArrayList<>();

        double total_notas = 0;

        for (List<Double> lista_tmp : notas_gerais) {
            double nota_1 = lista_tmp.get(0);
            double nota_2 = lista_tmp.get(1);

            total_notas += nota_1 + nota_2;

            double media = (nota_1 + nota_2 ) / 2;

            String mensagem = "";

            if (media <= 3) {
                mensagem = "Reprovado";
                lista_reprovados.add(media);

            } else if (media <= 7) {
                mensagem = "Exame";
                lista_exames.add(media);

            } else {
                mensagem = "Aprovado";
                lista_aprovados.add(media);
            }

            System.out.println(i + "° Aluno(a), média = " + media + " -> " + mensagem);

            i ++;

        }

        //Quantidade de aluno por status
        int qtd_aprovados = lista_aprovados.size();
        int qtd_exames = lista_exames.size();
        int qtd_reprovados = lista_reprovados.size();

        System.out.println("- Total de alunos aprovados: " + qtd_aprovados);
        System.out.println("- Total de alunos de exame: " + qtd_exames);
        System.out.println("- Total de alunos reprovados: " + qtd_reprovados);

        //Média da classe
        double media_classe = total_notas / 12;
        System.out.println("- Média da classe: " + String.format("%.2f", media_classe));

        sc.close();
    }
}
