package Q32;

public class CListaSimples {
	private CCelula primeira, ultima;

	public CListaSimples() {
		this.primeira = null;
		this.ultima = null;
	}

	public boolean vazia() {
		return primeira == null;
	}

	public void insereComeco(Object valorItem) {
		CCelula aux = new CCelula();
		aux.item = (int) valorItem;
		if (primeira != null)
			aux.prox = primeira;
		else {
			ultima = aux;
			aux.prox = null;
		}
		primeira = aux;
	}

	public Object removeComeco() {
		if (primeira != null) {
			Object elemento = primeira.item;
			primeira = primeira.prox;
			return elemento;
		}
		return null;
	}

	public void insereFim(Object valorItem) {
		CCelula aux = new CCelula();
		aux.item = (int) valorItem;
		if (primeira != null) {
			ultima.prox = aux;
			ultima = aux;
		} else {
			primeira = aux;
			ultima = primeira;
		}
	}

	public Object removeFim() {
		Object item;
		if (ultima != null) {
			if (primeira == ultima) {
				item = ultima.item;
				primeira = null;
				ultima = primeira;

			} else {
				CCelula aux = primeira;
				while (aux.prox != ultima) {
					aux = aux.prox;
				}
				item = aux.prox.item;
				ultima = aux;
				ultima.prox = null;
			}
			return item;
		}
		return null;
	}

	public void imprime() {
		CCelula aux = primeira;
		while (aux != null) {
			System.out.println(aux.item);
			aux = aux.prox;
		}
	}

	public boolean contem(Object elemento) {
		boolean achou = false;
		CCelula aux = primeira;
		while (aux != null && !achou) {
			achou = (int)aux.item == (int)elemento;
			aux = aux.prox;
		}
		return achou;
	}
}