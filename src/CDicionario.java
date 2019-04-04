import java.util.Scanner;

class CDicionario {
	private CCelulaDicionario primeira, ultima;

	public CDicionario() {
		primeira = new CCelulaDicionario();
		ultima = primeira;
	}

	public boolean vazio() {
		return primeira == ultima;
	}

	public boolean contem(Object chave) {
		boolean achou = false;
		CCelulaDicionario aux = primeira.prox;
		while (aux != null && !achou) {
			achou = aux.key.equals(chave);
			aux = aux.prox;
		}
		return achou;
	}

	public void adiciona(Object chave, Object valor) {
		if (contem(chave)) {
			ultima.prox = new CCelulaDicionario(chave, valor);
			ultima = ultima.prox;
		}
	}

	public Object recebeValor(Object chave) {
		boolean achou = false;
		CCelulaDicionario aux = primeira.prox;
		while (aux != null && !achou) {
			achou = aux.key.equals(chave);
			if (achou) {
				return aux.value;
			}
			aux = aux.prox;
		}
		return null;
	}

	public static void main(String args[]) {
		CDicionario teste = new CDicionario();
		Scanner in = new Scanner(System.in);
		teste.adiciona("www.yahoo.com", "72.30.35.9");
		teste.adiciona("www.microsoft.com", "23.62.41.228");
		teste.adiciona("www.twitter.com", "104.244.42.65");
		teste.adiciona("www.brasil.gov.br", "170.246.252.243");
		teste.adiciona("www.wikipedia.com", "208.80.154.224");
		teste.adiciona("www.google.com", "172.217.29.239");
		teste.adiciona("www.pucminas.com.br", "200.229.32.27");
		teste.adiciona("www.gmail.com", "172.217.162.101");
		teste.adiciona("www.youtube.com", "172.217.162.110");
		teste.adiciona("www.capes.gov.br", "200.130.18.222");
		teste.adiciona("www.uol.com.br", "52.84.175.134");
		teste.adiciona("www.hotmail.com", "204.79.197.202");
		teste.adiciona("www.cplusplus.com", "208.91.196.105");
		teste.adiciona("www.nyt.com", "151.101.93.164");
		teste.adiciona("www.apple.com", "23.55.32.111");
		teste.adiciona("www.amazon.com", "205.251.242.103");
		teste.adiciona("www.facebook.com", "31.13.85.36");
		teste.adiciona("research.microsoft.com", "13.67.218.189");
		teste.adiciona("www.whitehouse.gov", "23.1.225.229");
		teste.adiciona("www.answers.com", "151.101.128.203");
		teste.adiciona("www.instagram.com", "104.27.96.73");
		teste.adiciona("www.tecmundo.com", "185.88.181.4");
		teste.adiciona("www.netflix.com", "66.254.114.41");
		teste.adiciona("www.reddit.com", "151.101.93.140");
		teste.adiciona("www.github.com", "192.30.253.112");
		
		System.out.println(teste.recebeValor(in.nextLine()));
		in.close();
	}
}