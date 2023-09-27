import java.util.Scanner;

/*5. Faça um programa que leia o número de termos e um valor positivo para X, calcule e mostre o valor da série a
seguir:
S = - -x^2/1! + x^3/2! ...*/

public class Ex5_ValorS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos termos? ");
        int qtd_termos = sc.nextInt();

        System.out.println("Valor de X: ?");
        double x = sc.nextDouble();

        double s = 0;

        for (int expoente = 2; expoente < qtd_termos + 2; expoente ++) {
            double dividendo = Math.pow(x, expoente);
            double divisor = 1;

            switch ((expoente - 1) % 6) {
                case 1:
                    divisor = 1;
                    break;

                case 2:
                    divisor = 2;
                    break;

                case 3:
                    divisor = 6;
                    break;

                case 4: 
                    divisor = 24;
                    break;

                case 5: 
                    divisor = 6;
                    break;

                case 0: 
                    divisor = 2;
                    break;
            }

            double termo = dividendo/divisor;

            if (expoente % 2 == 0 ) {
                s = s - (termo);
            } else {
                s = s + (termo);
            }

        }

        System.out.println("S = " + s);

        sc.close();
    }
}