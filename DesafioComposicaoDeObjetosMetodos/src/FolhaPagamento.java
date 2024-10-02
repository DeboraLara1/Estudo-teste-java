
class FolhaPagamento {
    public double calcularSalario(double horasNormais, double horasExtras, ContratoDeTrabalho contrato) {
        double salarioNormal = horasNormais * contrato.getValorHoraNormal();
        double salarioExtra = horasExtras * contrato.getValorHoraExtra();
        double salarioTotal = salarioNormal + salarioExtra;

        if (contrato.temAdicionalParaFilhos()) {
            salarioTotal *= 1.10; // Adicional de 10% se o funcionário tiver filhos
        }

        return salarioTotal;
    }
}

