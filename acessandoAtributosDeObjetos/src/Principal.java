public class Principal {
    public static void main(String[] args) {
//        Carro meuCarro = new Carro();
//
//        meuCarro.anoFabricacao = 2021;
//        meuCarro.cor = "Preto";
//        meuCarro.modelo = "HR-V";
//        meuCarro.fabricante = "Honda";
//
//        System.out.printf("Modelo %s%n", meuCarro.modelo);
//        System.out.printf("Ano Fabricação %s%n", meuCarro.anoFabricacao);

        //Desafio: instanciando objetos e acessando os atributos
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.raca = "Akita";
        meuCachorro.nome = "Linda";
        System.out.printf("o cachorro %S é da raça %S", meuCachorro.nome, meuCachorro.raca);

    }
}
