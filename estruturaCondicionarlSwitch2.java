
import java.util.Scanner;

public class estruturaCondicionarlSwitch2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana (Ex: seg, ter, qua, etc)");
        String diaSemana = entrada.nextLine();
        String horarioFuncionamento;
        //Forma mais agil de fazer um switch sem precisar do breack, apartir do java 17
        switch (diaSemana) {
            case "seg" -> horarioFuncionamento = "Fechado";
            case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 às 18:00";
            case "dom" -> horarioFuncionamento = "08:00 às 12:0";
            default -> horarioFuncionamento = "Dia inválido";
        }

        System.out.printf("Gorario de funcionamento: %s. ", horarioFuncionamento);

    }
}
