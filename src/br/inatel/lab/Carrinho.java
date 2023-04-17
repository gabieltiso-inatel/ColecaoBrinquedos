package br.inatel.lab;

public class Carrinho extends Brinquedo {
    public Carrinho(String modelo, String cor) {
        super(modelo, cor);
    }

    public void mostrarInfos() {
        super.mostrarInfos();
    }

    @Override
    public void mover() {
        System.out.println("Carrinho está se movendo");
    }

    @Override
    public void ligar() {
        System.out.println("Carrinho está ligando");
    }
}
