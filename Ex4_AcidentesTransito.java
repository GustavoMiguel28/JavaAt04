import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*4. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos
os seguintes dados:
a) Código da cidade;
b) Número de veículos de passeio (em 2007)
c) Número de acidentes de trânsito com vítimas (em 2007)
Deseja-se saber:
a) Qual o maior e menor índice de acidentes de transito e a que cidades pertencem
b) Qual a média de veículos nas cinco cidades juntas
c) Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio*/

public class Ex4_AcidentesTransito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Guardando informações das cidades
        List<List<Integer>> lista_geral = new ArrayList<>();

        for (int i = 1; i <= 2; i ++) {
            List<Integer> lista_cidade = new ArrayList<Integer>();

            System.out.println("\nDigite as informações da " + i + "° Cidade.");

            System.out.print("Código da cidade: ");
            int cod_cidade = sc.nextInt();
            lista_cidade.add(cod_cidade);

            System.out.print("Número de veículos de passeio: ");
            int num_veiculos = sc.nextInt();
            lista_cidade.add(num_veiculos);

            System.out.print("Número de acidentes de trânsito com vítimas: ");
            int num_acidentes = sc.nextInt();
            lista_cidade.add(num_acidentes);

            lista_geral.add(lista_cidade);

        }

        /*
        //Maior e menor índice de acidente de trânsito
        List<Double> lista_indices = new ArrayList<Double>();

        for (List<Integer> lista_temp : lista_geral) {
            int num_veiculos = lista_temp.get(1);
            int num_acidentes = lista_temp.get(2);

            double ind_acidentes = num_acidentes / num_veiculos;

            lista_indices.add(ind_acidentes);
        } 
        */
        
        //Média de veículos nas cincos cidades juntas
        int total_veiculos = 0;

        for (List<Integer> lista_temp : lista_geral) {
            int num_veiculos = lista_temp.get(1);

            total_veiculos += num_veiculos;
        }

        double media_veiculos = total_veiculos / 5;

        System.out.print("Média de veículos nas cincos cidades: " + media_veiculos);

        sc.close();
    }
}
