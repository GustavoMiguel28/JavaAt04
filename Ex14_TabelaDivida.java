import java.text.DecimalFormat;

public class Ex14_TabelaDivida {
    public static void main(String[] args) {
        double valorDivida = 1000.00;
        int[] parcelas = {1, 3, 6, 9, 12};
        int[] jurosPercentuais = {0, 10, 15, 20, 25};

        DecimalFormat decimalFormat = new DecimalFormat("R$ #,##0.00");

        System.out.println("Valor da dívida\tValor dos juros\tQuantidade de parcelas\tValor da parcela");

        for (int i = 0; i < parcelas.length; i++) {
            double juros = (jurosPercentuais[i] / 100.0) * valorDivida;
            double valorTotal = valorDivida + juros;
            double valorParcela = valorTotal / parcelas[i];

            System.out.printf("%s\t%s\t%d\t%s%n",
                    decimalFormat.format(valorTotal),
                    decimalFormat.format(juros),
                    parcelas[i],
                    decimalFormat.format(valorParcela));
        }
    }
}
