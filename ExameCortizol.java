
import java.util.Scanner;

public class ExameCortizol{
	public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);

        System.out.print("Cortisol: ");
        double cortisol = entrada.nextDouble();

        //Cortisol ideal é de 6 a 18.4
        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        System.err.printf("Cortisol normal: %b%n", resultadoNormal);

         boolean resultadoAnormal = cortisol < 6.0 && cortisol > 18.4;
        System.err.printf("Cortisol anormal: %b%n", resultadoAnormal);
        
       
	}
}