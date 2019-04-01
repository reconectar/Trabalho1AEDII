public class Aluno {
	
	private String nome;
	private int matricula;
	public static int i=0;;
	
	public Aluno(){
		this.nome = "Capistrano";
		this.matricula = 11111;
	}
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public void matricular() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		
		i++;
		return i +" - " + nome + " - " + matricula;
	}
	
}
