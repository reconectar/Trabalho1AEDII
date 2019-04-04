class Deque {

	private CCelulaDup primeira; // Referencia a primeira celula da lista (celula cabeca)
	private CCelulaDup ultima; // Referencia a ultima celula da lista
	private int qtde;

	public Deque() {
		primeira = new CCelulaDup();
		ultima = primeira;
	}

	boolean isEmpty() {
		return primeira == ultima;
	}

	int size() {
		 return qtde;
	}

	public void pushLeft(Object item) {
		ultima.prox = new CCelulaDup(item, ultima, null);
		ultima = ultima.prox;
		qtde++;
	}

	public void pushRight(Object item) {
		if(isEmpty()) {
			pushLeft(item);
		}else {
			primeira.prox = new CCelulaDup(item, primeira, primeira.prox);
			primeira.prox.prox.ant = primeira.prox;
		}
		qtde++;
	}

	public Object popLeft() {
		Object item=null;
		if(!isEmpty()) {			
			item = primeira.prox.item;
			primeira = primeira.prox;
			primeira.ant = null;
			qtde--;
		}
		return item;
	}

	public Object popRight() {
		Object item=null;
		if (!isEmpty()) {
			item = ultima.item;
	        ultima = ultima.ant;
	        ultima.prox = null;
	        qtde--;	          
	       }
		return item;
	}
}