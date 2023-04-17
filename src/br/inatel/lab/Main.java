import br.inatel.lab.*;

public class Main {
   public static void main(String[] args) {
       Aviao a = new Aviao("Boeing", "Branco", 4);
       Barco b = new Barco("Navio pesqueiro", "Azul");
       Carrinho c = new Carrinho("Ferrari", "Vermelho");

       System.out.printf("Quantidade de brinquedos criados: %d\n", Brinquedo.getQtdBrinquedos());

       ColecaoBrinquedos colecao = new ColecaoBrinquedos();
       colecao.adicionarBrinquedos(a);
       colecao.adicionarBrinquedos(b);
       colecao.adicionarBrinquedos(c);

       colecao.listarBrinquedos();
   } 
}
