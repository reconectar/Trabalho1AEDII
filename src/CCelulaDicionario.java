class CCelulaDicionario {
	// Atributos
	public Object key, value;
	public CCelulaDicionario prox;

	// Construtora que anula os três atributos da célula
	public CCelulaDicionario() {
		key = null;
        value = null;
        prox = null;
	}

	// Construtora que inicializa key e value com os argumentos passados
	// por parâmetro e anula a referência à próxima célula
	public CCelulaDicionario(Object chave, Object valor) {
		key = chave;
		value = valor;
		prox = null;
	}

	// Construtora que inicializa todos os atribulos da célula com os argumentos
	// passados por parâmetro
	public CCelulaDicionario(Object chave, Object valor, CCelulaDicionario proxima) {
		key = chave;
		value = valor;
		prox = proxima;
	}
}