import java.util.Scanner;

public class Ex16_CalculoAreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base, altura;

        // Obter a base do triângulo
        do {
            System.out.print("Digite a base do triângulo (deve ser maior que 0): ");
            base = scanner.nextDouble();
        } while (base <= 0);

        // Obter a altura do triângulo
        do {
            System.out.print("Digite a altura do triângulo (deve ser maior que 0): ");
            altura = scanner.nextDouble();
        } while (altura <= 0);

        // Calcular a área do triângulo
        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}
