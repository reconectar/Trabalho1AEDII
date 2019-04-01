import java.util.Random;

class RandomQueue {
	private CCelula frente; // Celula cabeca.
	private CCelula tras; // Ultima celula.
	private int qtde;
	
	public RandomQueue() {
		frente = new CCelula();
		tras = frente;
	} // Construtora – cria uma RandomQueue vazia

	public boolean IsEmpty() {
		return frente == tras;		
	} // Retorna true se a RandomQueue estiver vazia

	void Enqueue(Object item) {
		tras.prox = new CCelula(item);
		tras = tras.prox;
		qtde++;
	} // Adiciona um item

	Object Dequeue() {
		CCelula aux = this.frente;
		Object item = null;
		int random = (int)(Math.random()*(this.qtde+1));
		if(!this.IsEmpty()) {
			for(int i=0; i<(random-1); i++) {
				aux = aux.prox;
			}
			item = aux.prox.item;
			aux.prox = aux.prox.prox;
		}		
		
		return item;
	} // Remove e retorna um elemento aleatório da RandomQueue

	Object Sample() {
		CCelula aux = this.frente;
		int random = (int)(Math.random()*(this.qtde+1));
		for(int i=0; i<random; i++) {
			aux = aux.prox;
		}
		return aux.item;
	} // Retorna um elemento aleatório sem removê-lo da RandomQueue

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
