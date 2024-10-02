
public class main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 2);
        ContratoDeTrabalho contrato = new ContratoDeTrabalho(funcionario, 50, 75);

        FolhaPagamento folha = new FolhaPagamento();

        double salario = folha.calcularSalario(160, 20, contrato);
        System.out.println("Salário devido: R$ " + salario);
    }
}

