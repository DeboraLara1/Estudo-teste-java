
import java.util.Scanner;
/*
A empresa que você trabalha descobriu que você está indo muito bem neste
curso de Java e pediu para que você desenvolvesse um programa que calcula
os pagamentos para os prestadores de serviços da empresa.
Este programa deve receber as seguintes entradas de dados do usuário:
• Nome (texto)
• Valor por hora (decimal)
• Horas trabalhadas (inteiro)
• Valor dos descontos (decimal)
A saída do programa deve ser um resumo da folha de pagamento, mostrando os
cálculos e os resultados finais, como no exemplo abaixo:
Folha de pagamento: Thiago Faria
172 horas x R$150.20 = R$25834.40
Descontos: R$482.88
Total devido: R$25351.52
Use a formatação de saída com printf para imprimir na saída e o
tipo Scanner para receber a entrada de dados do usuário.
*/
public class DesafioSstringEntradaDeDadosPrintf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	  	System.out.println("Digite seu nome: "  );
        String nome = entrada.nextLine();
	  	System.out.println("Digite seu valor/hora: "  );
        double valorHora = entrada.nextDouble();
		System.out.println("Digite suas horas trabalhadas: "  );
        int HrsTrabalhadas = entrada.nextInt();
        System.out.println("Digite o valor dos descontos: "  );
        double valorDesconto = entrada.nextDouble();

		double totalDevidoSemDesconto = HrsTrabalhadas * valorHora;
        double totalDevido = totalDevidoSemDesconto - valorDesconto;

	  	System.out.printf("Folha de pagamento: %s%n", nome);
	  	System.out.printf("%s horas X  %s = R$%s%n ", HrsTrabalhadas, valorHora, totalDevidoSemDesconto);
	  	System.out.printf("Descontos: R$%s%n", valorDesconto);
	  	System.out.printf("Total devido: R$%s%n", totalDevido);

    }
}