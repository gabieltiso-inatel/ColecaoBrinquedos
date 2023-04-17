package br.inatel.lab;

public class Barco extends Brinquedo {
    public Barco(String modelo, String cor) {
        super(modelo, cor);
    }

    public void mostrarInfos() {
        super.mostrarInfos();
    }

    @Override
    public void mover() {
        System.out.println("Barco está se movendo");
    }

    @Override
    public void ligar() {
        System.out.println("Barco está ligando");
    }
}
