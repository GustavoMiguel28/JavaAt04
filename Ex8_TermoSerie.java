import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*8. Faça um programa que leia o número de termos, determine e mostre os valores de acordo com a série abaixo:
Série: 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768, ...*/

public class Ex8_TermoSerie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista_serie = new ArrayList<>();

        lista_serie.add(2);
        lista_serie.add(7);
        lista_serie.add(3);
        lista_serie.add(4);
        lista_serie.add(21);
        lista_serie.add(12);
        lista_serie.add(8);
        lista_serie.add(63);
        lista_serie.add(48);
        lista_serie.add(16);
        lista_serie.add(189);
        lista_serie.add(192);
        lista_serie.add(32);
        lista_serie.add(567);
        lista_serie.add(768);

        System.out.print("Digite o termo desejado: ");
        int termo = sc.nextInt();

        System.out.print("Valor: " + lista_serie.get(termo - 1));

        sc.close();
    }
}