package CalculadoraIMC.src;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.58;
        paciente.peso = 79.1;

        IndiceMassaCorporal imc = paciente.calculadorIndiceMassaCorporal();

        if(imc.estaComObesidade()){
            System.out.printf("Paciente com altura de %.2f e " +
                    "peso de %.2f esta com obesidade %n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2d%n", imc.resultado);
    }
}
