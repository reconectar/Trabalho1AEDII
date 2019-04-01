public class Q4 {
	
	public static CListaDup ConcatenaLD(CListaDup L1, CListaDup L2) {
		CListaDup AmaisB = new CListaDup ();
		while(!L1.vazia()) {
			AmaisB.insereFim(L1.removeRetornaComeco());			
		}
		while(!L2.vazia()) {
			AmaisB.insereFim(L2.removeRetornaComeco());			
		}	
		
		return AmaisB;
	}

	public static void main(String[] args) {
		CListaDup A = new CListaDup ();
		CListaDup B = new CListaDup ();
		A.insereFim(19);
		A.insereFim(33);
		A.insereFim(2);
		A.insereFim(4);
		
		B.insereFim(1);
		B.insereFim(2);
		B.insereFim(3);
		B.insereFim(4);
		B.insereFim(5);
		
		ConcatenaLD(A, B);
		
	}
}
