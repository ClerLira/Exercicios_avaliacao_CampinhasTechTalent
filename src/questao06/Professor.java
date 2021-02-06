package questao06;

public class Professor extends Curso{
	
	
	private String nome;
	private String departamento;
	private String email;
		
	public Professor(String nome, int horario) {
		super(nome, horario);
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
