package entidades;

public class Quarto {
	private String nome;
	private String email;
	private Integer numero;
	
	public Quarto(String nome, String email, Integer numero) {
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return numero+": "+nome+", "+email;
	}
	
	
	
}
