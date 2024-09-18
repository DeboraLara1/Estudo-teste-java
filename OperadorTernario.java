
public class OperadorTernario {

    public static void main(String[] args) {

        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;

        double valorImposto = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;
        System.err.printf("Total faturado: R$%.2f%n", totalFaturado);
        System.err.printf("Valor dos impostos: R$%.2f%n", valorImposto);

    }
}
