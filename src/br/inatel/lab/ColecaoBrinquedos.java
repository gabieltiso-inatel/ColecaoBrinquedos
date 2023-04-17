package br.inatel.lab;

public class ColecaoBrinquedos {
    private Brinquedo[] brinquedos;

    public ColecaoBrinquedos() {
        this.brinquedos = new Brinquedo[3];
    }

    public Brinquedo[] getBrinquedos() {
        return brinquedos;
    }

    public void adicionarBrinquedos(Brinquedo brinquedo) {
        for(int i = 0; i < this.brinquedos.length; i++) {
           if(this.brinquedos[i] == null) {
               this.brinquedos[i] = brinquedo;
               break;
           }
        }
    }

    public void listarBrinquedos() {
        for(int i = 0; i < this.brinquedos.length; i++) {
           Brinquedo b = this.brinquedos[i];
           // Métodos específicos de cada subclasse
           if(b != null) {
               if(b instanceof Aviao) {
                   Aviao ba = (Aviao)b;
                   ba.mostrarInfos();
                   System.out.println("==== AÇÕES =====");
                   ba.ligar();
                   ba.mover();
                   System.out.println("===============");
               } else if(b instanceof Barco) {
                   Barco bb = (Barco)b;
                   bb.mostrarInfos();
                   System.out.println("==== AÇÕES =====");
                   bb.ligar();
                   bb.mover();
                   System.out.println("===============");
               } else {
                   Carrinho bc = (Carrinho)b;
                   bc.mostrarInfos();
                   System.out.println("==== AÇÕES =====");
                   bc.ligar();
                   bc.mover();
                   System.out.println("===============");
               }
           }
        }
    }
}

