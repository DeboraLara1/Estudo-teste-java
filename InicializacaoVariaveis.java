
import java.util.Scanner;

public class InicializacaoVariaveis {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preço dos produtos: ");
        double valorProdutos = entrada.nextDouble();

        System.out.println("Cobrar frete? (True our False)");
        boolean cobrarFrete = entrada.nextBoolean();

        double valorFrete = 0;

        if (cobrarFrete) {
            System.out.println("Valor do frete: ");
            valorFrete = entrada.nextDouble();
        } 
        
        double valorTotal = valorProdutos + valorFrete;
        System.out.printf("Valor total: R$%.2f%n ", valorTotal);

    }
}
