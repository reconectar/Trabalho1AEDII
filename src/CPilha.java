/**
 * @(#)CPilha.java
 *
 *
 * @author Rodrigo Richard Gomes
 * @version 1.00 2018/3/16
 */

public class CPilha {
	private CCelula topo = null;
	private int qtde;

	// Fun��o construtora.
	public CPilha() {
		// nenhum c�digo
	}

	// Verifica se a Pilha est� vazia.
	// Retorna TRUE se a PILHA estiver vazia e FALSE caso contr�rio.
	public boolean vazia() {
		return topo == null;
	}

	// Insere o novo item no topo da Pilha
	// <param name="Valoritem">Um Object contendo o item a ser inserido no topo da
	// Pilha.</param>
	public void empilha(Object valorItem) {
		topo = new CCelula(valorItem, topo);
		qtde++;
	}

	// Retira e retorna o item do topo da Pilha.
	// Retorna um Object contendo o item retirado do topo da Pilha. Caso a Pilha
	// esteja vazia retorna null.
	public Object desempilha() {
		Object item = null;
		if (topo != null) {
			item = topo.item;
			topo = topo.prox;
			qtde--;
		}
		return item;
	}

	// Verifica se o item passado como par�metro est� contido na lista.
	// O par�metro "valorItem"> � um object contendo o item a ser localizado.
	// Retorna TRUE caso o item esteja presente na lista.
	public boolean contem(Object valorItem) {
		boolean achou = false;
		CCelula aux = topo;
		while (aux != null && !achou) {
			achou = aux.item.equals(valorItem);
			aux = aux.prox;
		}
		return achou;
	}

	// Verifica se o item passado como par�metro est� contido na pilha. (Obs: usa o
	// comando FOR)
	// O par�metro "valorItem"> � um object contendo o item a ser localizado.
	// Retorna TRUE caso o item esteja presente na lista.
	public boolean contemFor(Object valorItem) {
		boolean achou = false;
		for (CCelula aux = topo; aux != null && !achou; aux = aux.prox)
			achou = aux.item.equals(valorItem);
		return achou;
	}

	// Retorna um Object contendo o item do topo da Pilha. Caso a Pilha esteja vazia
	// retorna null.
	public Object peek() {
		return (topo != null) ? topo.item : null;
	}

	// M�todo que retorna a quantidade de itens da Pilha.
	public int quantidade() {
		return qtde;
	}

	// Questao 8 lista 3 LABII
	// Chama o m�todo desempilha enquanto nao estiver vazio (enquanto quantidade for
	// diferente de 0)
	void limpa() {
		this.topo = null;
	}

}