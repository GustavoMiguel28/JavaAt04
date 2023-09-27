import java.util.Scanner;

/*15. Faça um programa que receba o preço unitário, a refrigeração (S para os produtos que necessitam de refrigeração e
N para os que não necessitam de refrigeração) e a categoria (A- alimentação, L- limpeza e V- vestuário) de 12
produtos. Calcule e mostre:
 O custo de estocagem calculado de acordo com a tabela a seguir:
Preço Unitário Refrigeração Categoria Custo de Estocagem
Até R$ 20,00 A R$ 2,00
L R$ 3,00
V R$ 4,00
Entre R$ 20,00 e R$
50,00 (inclusive)
S R$ 6,00
N R$ 0,00
Maior que R$ 50,00 S A R$ 5,00
L R$ 2,00
V R$ 4,00
N A ou V R$ 0,00
L R$ 1,00
 O imposto é calculado de acordo com as regras a seguir:
Se o produto não preencher nenhum dos requisitos abaixo, seu imposto será de 2% sobre o preço unitário; caso
contrário, será de 4%.
Os requisitos são: Categoria – A e Refrigeração S
 O preço final é calculado observando as informações anteriores, ou seja, preço unitário mais custo de estocagem
mais imposto;
 A classificação é calculada usando a tabela a seguir:
Preço final Classificação
Até R$ 20,00 Barato
Entre R$ 20,00 e R$ 100,00 Normal
Acima de R$ 100,00 Caro
 A média dos valores adicionais, ou seja, a média dos custos de estocagem e dos impostos dos 12 produtos;
 O maior preço final;
 O menor preço final;
 O total de impostos;
 A quantidade de produtos com classificação barato;
 A quantidade de produtos com classificação caro;
 A quantidade de produtos com classificação normal.*/

public class Ex15_CustoEstocagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaValoresAdicionais = 0;
        double maiorPrecoFinal = 0;
        double menorPrecoFinal = Double.MAX_VALUE;
        double totalImpostos = 0;
        int quantBaratos = 0;
        int quantCaros = 0;
        int quantNormal = 0;
        for (int i = 0; i < 12; i++) {
            System.out.println("Item: " + i + ", preço unitário:");
            double preco = sc.nextDouble();
            System.out.println("Item: " + i + " refrigeração:");
            String refrigeracao = sc.next();
            System.out.println("Item: " + i + ", categoria:");
            String categoria = sc.next();
            // custo estocagem
            double estocagem = 0;
            System.out.println("->" + categoria + "<-");
            if (preco <= 20) {
                switch (categoria) {
                    case "A": 
                        estocagem = 2;
                        break;

                    case "L": 
                        estocagem = 3;
                        break;

                    case "V": 
                        estocagem = 4;
                        break;

                }
            } else if (preco <= 50 && refrigeracao.equals("S")) {
                estocagem = 6;

            } else {
                if (refrigeracao.equals("S")) {
                    switch (categoria) {
                        case "A": 
                            estocagem = 5;
                            break;

                        case "L": 
                            estocagem = 2;
                            break;

                        case "V": 
                            estocagem = 4;
                            break;
                    }
                } else {
                    if (categoria.equals("L")) {
                        estocagem = 1;
                    }
                }
            }
            System.out.println("O custo da estocagem é: " + estocagem);
            // imposto
            double imposto = 0.02;
            if (categoria.equals("A") && refrigeracao.equals("S")) {
                imposto = 0.04;
            }
            totalImpostos += preco * imposto;
            System.out.println("Alíquota de imposto: " + imposto);
            // preço final
            double precoFinal = preco + estocagem + (preco * imposto);
            somaValoresAdicionais += estocagem + (preco * imposto);
            if (precoFinal > maiorPrecoFinal) {
                maiorPrecoFinal = precoFinal;
            }
            if (precoFinal < menorPrecoFinal) {
                menorPrecoFinal = precoFinal;
            }
            System.out.println("Preço final: " + precoFinal);
            // classificação
            String classificacao = "";
            if (precoFinal <= 20) {
                classificacao = "Barato";
                quantBaratos++;
            } else if (precoFinal <= 100) {
                classificacao = "Normal";
                quantNormal++;
            } else {
                classificacao = "Caro";
                quantCaros++;
            }
            System.out.println("Classificação: " + classificacao);
        }
        System.out.println("\nMédia dos valores adicionais: " + (somaValoresAdicionais / 12));
        System.out.println("Maior preço final:" + maiorPrecoFinal);
        System.out.println("Menor preço final:" + menorPrecoFinal);
        System.out.println("Total de impostos: " + totalImpostos);
        System.out.println("Baratos: " + quantBaratos);
        System.out.println("Normal: " + quantNormal);
        System.out.println("Caros: " + quantCaros);
        sc.close();
    }
}