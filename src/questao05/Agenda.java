package questao05;

public class Agenda {

	private Contato[] contatos;
	private String nome;
	
	
	public Agenda(Contato[] contatos, String nome) {
		super();
		this.contatos = contatos;
		this.nome = nome;
	}
	

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
