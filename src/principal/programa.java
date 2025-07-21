package principal;
import entidades.Lista_duplamente_encadeada;
public class programa {
	public static void main(String[] args) {
		Lista_duplamente_encadeada lista = new Lista_duplamente_encadeada();
		lista.inserir_fim(8);
		lista.inserir_fim(12);
		lista.inserir_fim(19);
		lista.inserir_fim(43);
		lista.inserir_fim(45);
		lista.inserir_fim(56);
		lista.inserir_fim(67);
		lista.inserir_fim(95);
		
		System.out.println("Busca Sequencial");
		System.out.printf("Busca de 19 = Posicao %d", lista.busca_sequencial(19));
		System.out.println("\n\nBusca Sequencial com sentinela");
		System.out.printf("Busca de 45 = Posicao %d", lista.busca_sequencial_sentinela(45));
		System.out.println("\n\nBusca Binaria");
		System.out.printf("Busca de 8 = Posicao %d\n", lista.busa_binaria(8));
		System.out.println("\n\nBusca Binaria rapida");
		System.out.printf("Busca de 81 = Posicao %d\n", lista.busa_binaria_rapida(81));
		
	}
}
