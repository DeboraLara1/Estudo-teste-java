
public class ContratoDeTrabalho {
    private Funcionario funcionario;
    private double valorHoraNormal;
    private double valorHoraExtra;

    // Construtor
    public ContratoDeTrabalho(Funcionario funcionario, double valorHoraNormal, double valorHoraExtra) {
        this.funcionario = funcionario;
        this.valorHoraNormal = valorHoraNormal;
        this.valorHoraExtra = valorHoraExtra;
    }

    // Métodos
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public boolean temAdicionalParaFilhos() {
        return funcionario.getQuantidadeFilhos() > 0;
    }
}
