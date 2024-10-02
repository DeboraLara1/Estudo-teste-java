
public class Funcionario {
    String nome;
    int quantidadeFilhos;

    public Funcionario(String nome, int quantidadeFilhos) {
        this.nome = nome;
        this.quantidadeFilhos = quantidadeFilhos;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFilhos() {
        return quantidadeFilhos;
    }

    public boolean temAdicionalParaFilhos() {
        return quantidadeFilhos > 0;
    }
}
