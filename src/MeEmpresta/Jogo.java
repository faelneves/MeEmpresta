package MeEmpresta;

public class Jogo {
	private int id;
	private String nome;
	private String descricao;
	
	public Jogo(int id) {
		super();
		this.id = id;
	}
	
	public Jogo(int id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getId() {
		return id;
	}
	
	
}
