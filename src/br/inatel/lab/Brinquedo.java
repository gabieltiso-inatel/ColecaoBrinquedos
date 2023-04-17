package br.inatel.lab;

public abstract class Brinquedo {
    private static int qtdBrinquedos = 0;

    private String modelo;
    private String cor;

    public Brinquedo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;

        qtdBrinquedos++;
    }

    public static int getQtdBrinquedos() {
        return qtdBrinquedos;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public static void setQtdBrinquedos(int qtdBrinquedos) {
        Brinquedo.qtdBrinquedos = qtdBrinquedos;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mover() {
        System.out.println("Brinquedo está se movendo");
    };

    public void ligar() {
        System.out.println("Brinquedo está ligando");
    };

    public void mostrarInfos() {
        System.out.printf("Modelo: %s\nCor: %s\n", this.modelo, this.cor);
    };
}
