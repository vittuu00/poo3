
public class Ex_01 {

	private String nome;
	private String sobrenome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("seu nome completo �: ");
		builder.append(nome);
		builder.append(" ");
		builder.append(sobrenome);
		return builder.toString();
	}
}
