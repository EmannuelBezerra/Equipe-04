package entidades;



public class Lista_duplamente_encadeada {
	public class NO{
		Integer dado;
		NO anterior;
		NO proximo;
		
		public NO(Integer dado) {
			this.dado = dado;
			this.anterior = null;
			this.proximo = null;
		}	
	}
	
	private NO inicio;
	private NO fim;
	private Integer tamanho;
	

	public Lista_duplamente_encadeada() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}
	
	public boolean isVazia(){
		return inicio==null;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public void inserir_inicio(Integer dado) {
		NO novo = new NO(dado);
		if (isVazia()) {
			inicio = novo;
			fim = novo;
		}else {
			inicio.anterior = novo;
			novo.proximo = inicio;
			inicio = novo;
		}
		tamanho++;
	}
	
	public void inserir_fim(Integer dado) {
		NO novo = new NO(dado);
		if (isVazia()) {
			inicio = novo;
			fim = novo;
		}else {
			fim.proximo=novo;
			novo.anterior=fim;
			fim=novo;
		}
		tamanho++;
	}
	
	public Integer remover_inicio() {
		if (isVazia()) {
			throw new RuntimeException("Lista vazia!");
		}else {
			Integer dado = inicio.dado;
			if(inicio.proximo==null) {
				
				inicio = null;
				fim = null;
			}else {
				inicio = inicio.proximo;
				inicio.anterior = null;
			}
			tamanho --;
			return dado;
		}
	}
	
	public Integer remover_fim() {
		if (isVazia()) {
			throw new RuntimeException("Lista vazia!");
		}else {
			Integer dado = fim.dado;
			if(inicio.proximo==null) {
				inicio = null;
				fim = null;
			}else {
				fim = fim.anterior;
				fim.proximo=null;
			}
			tamanho--;
			return dado;
		}
	}
	
	public void exibir() {
		if(isVazia()) {
			System.out.println("Lista vazia!");
			return;
		}
		
		NO atual = inicio;
		System.out.print("Lista (início->fim): ");
		while(atual!=null) {
			System.out.print(atual.dado + " ");
			atual = atual.proximo;
		}
		System.out.println();
	}
	
	public int busca_sequencial(Integer dado) {
		NO atual = inicio;
		int pos = 0;;
		if(isVazia()) {
			System.out.println("Lista vazia!");
			return -1;
		}else {
			while(atual != null){
				if(atual.dado.equals(dado)) {
					return pos;
				}
				atual = atual.proximo;
				pos++;
			}
			return -1;
		}
	}
	
	public int busca_sequencial_sentinela(Integer dado) {
		if(isVazia()) {
			System.out.println("Lista vazia!");
			return -1;
		}
		
		inserir_fim(dado);
		NO atual = inicio;
		int pos=0;
		
		while(!atual.dado.equals(dado)){
			atual=atual.proximo;
			pos++;
		}
		if(pos == tamanho - 1) {
			remover_fim();
			return -1;
	   }else {
		   remover_fim();
		   return pos;
	   }
	}
	
	public NO getNO(int pos) {
		if(pos < 0 || pos >= tamanho) {
			throw new IndexOutOfBoundsException("Posição inválida: " + pos);
		}
		NO atual = inicio;
		for (int i = 0; i < pos; i++){
			atual = atual.proximo;
		}
		return atual;
	}
	
	public int busa_binaria(Integer dado) {
		int L = 0;
		int R = tamanho-1;
		
		while(L <= R) {
			int m = (L + R)/2;
			NO meio = getNO(m);
			Integer valormeio = meio.dado;
			if(valormeio < dado) {
				L =m+1;
			}else if(valormeio > dado) {
				R = m-1;
			}else {
				return m;
			}
		}
		return -1;
	}
	
	public int busa_binaria_rapida(Integer dado) {
		int L = 0;
		int R = tamanho-1;
		
		while(L < R) {
			int m = (L + R)/2;
			NO meio = getNO(m);
			Integer valormeio = meio.dado;
			if(valormeio < dado) {
				L =m+1;
			}else {
				R = m;
			}
		}
		NO noFinal = getNO(L);
		return (noFinal.dado.equals(dado)) ? L : -1;
	}
	
	
	
}
