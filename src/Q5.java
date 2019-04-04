public class Q5 {
	
	public static CFila ConcatenaFila(CFila F1, CFila F2) {
		CFila AmaisB = new CFila ();
		while(!F1.vazia()) {
			AmaisB.enfileira(F1.desenfileira());			
		}
		while(!F2.vazia()) {
			AmaisB.enfileira(F2.desenfileira());			
		}		
		return AmaisB;
	}

	public static void main(String[] args) {
		CFila A = new CFila ();
		CFila B = new CFila ();
		A.enfileira(19);
		A.enfileira(33);
		A.enfileira(2);
		A.enfileira(4);
		
		B.enfileira(1);
		B.enfileira(2);
		B.enfileira(3);
		B.enfileira(4);
		B.enfileira(5);
		
		ConcatenaFila(A, B);
		
	}
}
