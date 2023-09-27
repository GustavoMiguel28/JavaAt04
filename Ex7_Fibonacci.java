import java.util.Scanner;

/*7. Faça um programa que monte os oito primeiros termos da sequência de Fibonacci.
0 – 1 – 1 – 2 – 3 – 5 – 8 – 13 – 21 – 34 – 55 - ...*/

public class Ex7_Fibonacci {
        public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos termos? ");
        int termos = sc.nextInt();
        System.out.println();
        for (int i = 0; i < termos; i++) {
            System.out.print(a + "-");
            int temp = b;
            b += a;
            a = temp;
        }
        System.out.println();
        sc.close();
    }
}
