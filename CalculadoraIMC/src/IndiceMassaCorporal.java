package CalculadoraIMC.src;

public class IndiceMassaCorporal {
    double resultado;
    double altura;
    double peso;

    boolean estaComObesidade(){
        return  resultado >= 30;
    }
}
