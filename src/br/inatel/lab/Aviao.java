package br.inatel.lab;

public class Aviao extends Brinquedo {
    private int quantidadeMotores;

    public Aviao(String modelo, String cor, int quantidadeMotores) {
        super(modelo, cor);
        this.quantidadeMotores = quantidadeMotores;
    }

    public int getQuantidadeMotores() {
        return quantidadeMotores;
    }

    public void setQuantidadeMotores(int quantidadeMotores) {
        this.quantidadeMotores = quantidadeMotores;
    }

    public void mostrarInfos() {
        super.mostrarInfos();
        System.out.println("Informações específicas do Avião: ");
        System.out.printf("Quantidade de motores: %d\n", this.quantidadeMotores);
    }

    @Override
    public void mover() {
        System.out.println("Avião está se movendo");
    }

    @Override
    public void ligar() {
        System.out.println("Avião está ligando");
    }
}
