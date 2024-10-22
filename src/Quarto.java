public class Quarto {
    int numero;
    String tipo; // solteiro, casal, suite
    double precoDiario;
    boolean disponivel;

    public Quarto(int numero, String tipo, double precoDiario, boolean disponivel) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiario = precoDiario;
        this.disponivel = disponivel;
    }

    public void exibirDetalhes() {
        System.out.println("Quarto " + numero + " (" + tipo + ") - Preço: R$" + precoDiario + " - Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}