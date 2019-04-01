public class Q6 {
	
	public static  CPilha ConcatenaPilha(CPilha P1, CPilha P2) {
		CPilha AmaisB = new CPilha ();
		while(!P1.vazia()) {
			AmaisB.empilha(P1.desempilha());			
		}
		while(!P2.vazia()) {
			AmaisB.empilha(P2.desempilha());			
		}	
		
		return AmaisB;
	}

	public static void main(String[] args) {
		CPilha A = new CPilha ();
		CPilha B = new CPilha ();
		A.empilha(19);
		A.empilha(33);
		A.empilha(2);
		A.empilha(4);
		
		B.empilha(1);
		B.empilha(2);
		B.empilha(3);
		B.empilha(4);
		B.empilha(5);
		
		ConcatenaPilha(A, B);
		
	}
}
